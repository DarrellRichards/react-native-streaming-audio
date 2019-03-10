//
//  AudioPlayer.m
//  RNStreamingAudio
//
//  Created by Darrell Richards on 3/7/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(AudioPlayer, NSObject)
    RCT_EXTERN_METHOD(start:(NSString *)url)
    RCT_EXTERN_METHOD(stop)
@end
