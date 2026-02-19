import React from 'react'
import GrowthImage from './../assets/images/growth1.jpg'
const Growth = () => {
    return (
        <div>
            <div className="row justify-content-evenly p-5 pt-2">
                <h3 className='text-center p-4'>Our Organization Growth</h3>
                <div className="col-md-5">
                    <img src={GrowthImage} className="img-fluid" alt="..."></img>
                </div>
                <div className="col-md-5">
                    <h6>MySQL Development</h6>
                    <div className="progress mb-4" role="progressbar" aria-label="Success example" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">
                        <div className="progress-bar text-bg-success" style={{width: '25%'}}>25%</div>
                    </div>
                    <h6>Springboot Development</h6>
                    <div className="progress mb-4" role="progressbar" aria-label="Info example" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">
                        <div className="progress-bar text-bg-info" style={{width: '50%'}}>50%</div>
                    </div>
                    <h6>Bootstrap Development</h6>
                    <div className="progress mb-4" role="progressbar" aria-label="Warning example" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">
                        <div className="progress-bar text-bg-warning" style={{width: '75%'}}>75%</div>
                    </div>
                    <h6>JavaScript Development</h6>
                    <div className="progress mb-4" role="progressbar" aria-label="Danger example" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">
                        <div className="progress-bar text-bg-danger" style={{width: '100%'}}>100%</div>
                    </div>
                    <h6>React Development</h6>
                    <div className="progress mb-4" role="progressbar" aria-label="Info example" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">
                        <div className="progress-bar text-bg-info" style={{width: '50%'}}>50%</div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Growth