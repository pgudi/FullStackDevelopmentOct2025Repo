import CarouselComponent from "./components/CarouselComponent"
import Footer from "./components/Footer"
import FooterDetails from "./components/FooterDetails"
import Growth from "./components/Growth"
import NavBar from "./components/NavBar"
import TagLine from "./components/TagLine"
import TeamMembers from "./components/TeamMembers"
import VisionMissionAims from "./components/VisionMissionAims"
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import HomePage from "./pages/HomePage"
import ServicesPage from "./pages/ServicesPage"
import ContactPage from "./pages/ContactPage"
import AboutPage from "./pages/AboutPage"

function App() {

  return (
    <>
      <BrowserRouter>
          <NavBar />
          <Routes>
             <Route path="/" element={<HomePage />}></Route>
             <Route path="/services" element={<ServicesPage />}></Route>
             <Route path="/contact" element={<ContactPage />}></Route>
             <Route path="/about" element={<AboutPage />}></Route>
          </Routes>
          <FooterDetails />
          <Footer />
      </BrowserRouter>
      
      
      
    </>
  )
}

export default App
