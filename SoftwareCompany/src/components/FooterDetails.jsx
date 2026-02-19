import React from 'react'
import {Link} from 'react-router-dom'
const FooterDetails = () => {
  return (
    <div>
        <div className="row justify-content-evenly bg-dark p-5">
            <div className="col-md-3">
                <h5 className='text-white'>MKN Softwares</h5>
                <p className='text-white'>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Repudiandae sequi ducimus non aspernatur!</p>
            </div>
            <div className="col-md-3 text-white">
                <h5>Important Links</h5>
                <ul className='list-unstyled'>
                    <li><Link to={'/'} className='text-decoration-none text-white' href="">Home</Link></li>
                    <li><Link to={'/services'} className='text-decoration-none text-white' href="">Services</Link></li>
                    <li><Link to={'/contact'} className='text-decoration-none text-white' href="">Contact Us</Link></li>
                    <li><Link to={'/about'} className='text-decoration-none text-white' href="">About Us</Link></li>
                </ul>
            </div>
            <div className="col-md-3 text-white">
                <h5>Address</h5>
                <p>MKN Softwares Attigupe <br /> Metro Station Vijayanagar 2nd <br /> Phase Bangalore -560023 <br />
                        <i className="bi bi-telephone"></i>: 080-234-567-123</p>
            </div>
        </div>
    </div>
  )
}

export default FooterDetails