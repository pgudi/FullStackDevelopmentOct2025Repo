import CreateProject from "./components/CreateProject"
import ListProjects from "./components/ListProjects"
import NavBar from "./components/NavBar"
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import HomePage from "./pages/HomePage"
function App() {
  return (
    <>
    <BrowserRouter>
      <NavBar />
      <Routes>
          <Route path="/" element={<HomePage />}></Route>
          <Route path="/projects" element={<ListProjects />}></Route>
          <Route path="/create-project" element={<CreateProject />}></Route>
          <Route path="/edit-project/:id" element={<CreateProject />}></Route>
      </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
