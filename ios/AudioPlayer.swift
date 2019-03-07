//
//  AudioPlayer.swift
//  RNStreamingAudio
//
//  Created by Darrell Richards on 3/7/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation
import AVFoundation

@objc(AudioPlayer)
class AudioPlayer: NSObject {
    var player = AVPlayer()
    @objc static func requiresMainQueueSetup() -> Bool {
        return true
    }
    
    @objc func start(_ url: String) {
        let playerItem = AVPlayerItem(url: URL(string: url)!)
        player = AVPlayer(playerItem: playerItem)
        player.rate = 1.0;
        player.play()
    }
    
    @objc func stop() {
        player.pause()
    }
}
