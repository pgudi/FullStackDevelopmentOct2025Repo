import React from 'react'

const Contact = () => {
    return (
        <div>
            <div className="row justify-content-evenly mt-5 mb-5" style={{backgroundColor:'#f1f1f1'}}>
                <h5 className="text-center">Contact Us</h5>
                <div className="col-md-5">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Full Name</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Full Name"/>
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Email address</label>
                        <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="E-Mail Address"/>
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlTextarea1" class="form-label">Message</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="Describe Yourself"></textarea>
                    </div>
                    <div>
                        <button type='submit' className='btn btn-primary me-2'>Submit</button>
                        <button type='reset' className='btn btn-success'>Reset</button>
                    </div>
                </div>
                <div className="col-md-5">
                    <h5>Address</h5>
                <p>MKN Softwares Attigupe <br /> Metro Station Vijayanagar 2nd <br /> Phase Bangalore -560023 <br />
                        <i className="bi bi-telephone"></i>: 080-234-567-123</p>
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3887.868019307802!2d77.59041707420508!3d12.980292214689454!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae166e527577a1%3A0xbeb84e228ed2e607!2sVidhana%20Soudha%20Karnataka%20High%20Court!5e0!3m2!1sen!2sin!4v1771469578291!5m2!1sen!2sin" width="400" height="250" style={{border:'0'}} allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                </div>
            </div>
        </div>
    )
}

export default Contact