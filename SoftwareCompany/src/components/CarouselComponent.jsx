import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import CarouselImg from './../assets/images/bnr15.jpg'

const CarouselComponent = () => {
    return (
        <Carousel>
            <Carousel.Item>
                <img src={CarouselImg} className="d-block w-100" alt="..."></img>
            </Carousel.Item>
            <Carousel.Item>
                <img src={CarouselImg} className="d-block w-100" alt="..."></img>
            </Carousel.Item>
            <Carousel.Item>
                <img src={CarouselImg} className="d-block w-100" alt="..."></img>
            </Carousel.Item>
        </Carousel>
    )
}

export default CarouselComponent