import React from 'react'
import TeamImage from './../assets/images/user1.jpg'
const TeamMembers = () => {
    return (
        <div>
            <div className="row justify-content-evenly p-5 pt-2 mt-2">
                <h3 className='text-center p-4'>Our Team Members</h3>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={TeamImage} className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Santosh</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">More Info</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={TeamImage} className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Vijay</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">More Info</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={TeamImage} className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Manjunath</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">More Info</a>
                            </div>
                    </div>
                </div>
            </div>
            <div className="row justify-content-evenly p-5 mt-2">
                <div className="col-md-3">
                    <div className="card" >
                        <img src={TeamImage} className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Achyut</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">More Info</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={TeamImage} className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Akshaya</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">More Info</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card" >
                        <img src={TeamImage} className="card-img-top" alt="..." />
                            <div className="card-body">
                                <h5 className="card-title">Geetha</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">More Info</a>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default TeamMembers