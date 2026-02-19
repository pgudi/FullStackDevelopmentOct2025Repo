import React from 'react'
import ServiceImage from './../assets/images/service1.jpg'
const Services = () => {
    return (
        <div>
            <div className="row justify-content-evenly p-5 pt-2 mt-2">
                <h3 className='text-center p-4'>Our Services</h3>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Springboot</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Bootstrap</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">React</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
            </div>
            <div className="row justify-content-evenly p-5 pt-2 mt-2">
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">JavaScript</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Playwright</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Selenium</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
            </div>
            <div className="row justify-content-evenly p-5 pt-2 mt-2">
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Deployment</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Docker</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={ServiceImage} className="card-img-top" alt="..." />
                        <div className="card-body">
                            <h5 className="card-title">Html & CSS</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">More Info</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Services