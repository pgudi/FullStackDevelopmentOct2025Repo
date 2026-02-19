import React from 'react'
import CarouselComponent from '../components/CarouselComponent'
import TagLine from '../components/TagLine'
import VisionMissionAims from '../components/VisionMissionAims'
import TeamMembers from '../components/TeamMembers'
import Growth from '../components/Growth'

const HomePage = () => {
    return (
        <div>
            <CarouselComponent />
            <TagLine />
            <VisionMissionAims />
            <TeamMembers />
            <Growth />
        </div>
    )
}

export default HomePage