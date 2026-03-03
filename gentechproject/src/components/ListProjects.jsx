import React, { useEffect, useState } from 'react'
import { deleteExistingProject, getAllProjects } from '../services/ProjectServices'
import { useNavigate } from 'react-router-dom'

const ListProjects = () => {
    const [projects, setProject] = useState([])
    const navigate = useNavigate()
    function getProjects(){
        getAllProjects().then((response)=>{
            console.log(response.data);
            setProject(response.data)
        })
    }

    useEffect(()=>{
        getProjects()
    },[])

    function createProject(){
        navigate('/create-project')
    }
    function editProject(id){
        navigate(`/edit-project/${id}`)
        console.log("Project Id for Edit :"+id);
        
    }
    function deleteProject(id){
        const status = confirm("Do you want Delete Project permanently?")
        console.log("Status Confirm :"+status);
        console.log("Project Id :"+id);
        
        if(status){
            if(id){
                deleteExistingProject(id).then((response) =>{
                console.log(response.data)
                 getProjects()
            })
            }
        }
    }
  return (
    <div>
        <div className="container">
            <button className='btn btn-primary mt-5' onClick={createProject}>Add Projects</button>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                        <th>Project Id</th>
                        <th>Title</th>
                        <th>Domain</th>
                        <th>Description</th>
                        <th>Operations</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        projects.map((project) =>{
                            return(
                                <tr key={project.id}>
                                <td>{project.id}</td>
                                <td>{project.projectTitle}</td>
                                <td>{project.projectDomain}</td>
                                <td>{project.projectDescription}</td>
                                <td>
                                    <button className='btn btn-success me-2' onClick={()=>editProject(project.id)}>Edit</button>
                                    <button className='btn btn-danger' onClick={()=>deleteProject(project.id)}>Delete</button>
                                </td>
                            </tr>
                            )
                        })
                    }
                </tbody>
            </table>
        </div>
    </div>
  )
}

export default ListProjects