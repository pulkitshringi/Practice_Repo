import React from 'react'
import { useParams } from 'react-router-dom';

const ProfileId = () => {
  return (
    <div>This is Profile {useParams().id}</div>
  )
}

export default ProfileId