import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { createProject, getExistingProject, updateExistingProject } from '../services/ProjectServices'

const CreateProject = () => {
    const [projectTitle, setProjectTitle] = useState('')
    const [projectDomain, setProjectDomain] = useState('')
    const [projectDescription, setProjectDescription] = useState('')

    const navigate = useNavigate()
    const {id} = useParams()

    function handleSaveAndEdit(e){
        e.preventDefault()
        const project ={projectTitle,projectDomain, projectDescription}
        if(id){
            updateExistingProject(id, project).then((response) =>{
               console.log(response.data)
                navigate("/projects")
            })
        }else{
            createProject(project).then(response =>{
            console.log(response.data)
            navigate("/projects")
        })
        }
    }
    function handleCancel(){
        navigate("/projects")
    }

    useEffect(()=>{
        getExistingProject(id).then((response) =>{
            setProjectTitle(response.data.projectTitle)
            setProjectDomain(response.data.projectDomain)
            setProjectDescription(response.data.projectDescription)
        })
    },[id])
    return (
        <div>
            <div className="container">
                <div className="row justify-content-evenly">
                    <h3 className='text-center p-5'>Create Project</h3>
                    <div className="col-md-6">
                        <div className="card">
                            <div className="card-body">
                                <form >
                                    <div className='form-group'>
                                        <div>
                                            <label className='form-label'>Project Title</label>
                                        </div>
                                        <input type="text"
                                            name={projectTitle}
                                            value={projectTitle}
                                            className='form-control'
                                            onChange={(e) => setProjectTitle(e.target.value)}
                                        />
                                    </div>
                                    <div className='form-group'>
                                        <div>
                                            <label className='form-label'>Project Domain</label>
                                        </div>
                                        <input type="text"
                                            name={projectDomain}
                                            value={projectDomain}
                                            className='form-control'
                                            onChange={(e) => setProjectDomain(e.target.value)}
                                        />
                                    </div>
                                    <div className='form-group'>
                                        <div>
                                            <label className='form-label'>Description</label>
                                        </div>
                                        <input type="text"
                                            name={projectDescription}
                                            value={projectDescription}
                                            className='form-control'
                                            onChange={(e) => setProjectDescription(e.target.value)}
                                        />
                                    </div>
                                    <div className='mt-3'>
                                        <button className='btn btn-primary me-3' onClick={handleSaveAndEdit}>Save</button>
                                        <button className='btn btn-danger' onClick={handleCancel}>Cancel</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    )
}

export default CreateProject