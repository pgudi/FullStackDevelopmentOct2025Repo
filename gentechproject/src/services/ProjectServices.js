import axios from 'axios'
const API_BASE_URL = "http://localhost:8083/api/v1/projects"

export const getAllProjects=()=>{
     return axios.get(API_BASE_URL)
}

export const createProject=(project)=>{
     return axios.post(API_BASE_URL, project)
}

export const deleteExistingProject=(id)=>{
     return axios.delete(API_BASE_URL +"/"+ id)
}

export const getExistingProject=(id)=>{
     return axios.get(API_BASE_URL +"/"+ id)
}

export const updateExistingProject=(id, project)=>{
     return axios.put(API_BASE_URL +"/"+ id, project)
}