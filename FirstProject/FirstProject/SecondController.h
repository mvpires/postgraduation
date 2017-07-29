//
//  SecondController.h
//  FirstProject
//
//  Created by Treinamento on 29/07/17.
//  Copyright © 2017 Treinamento. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface SecondController : UIViewController <UITextFieldDelegate>

@property (nonatomic, strong)NSString *nome;
@property (weak, nonatomic) IBOutlet UILabel *labelSegunda;
@property (nonatomic, strong)NSArray *meuArray;
@property (weak, nonatomic) IBOutlet UILabel *EmailTextField;
@property (weak, nonatomic) IBOutlet UILabel *SenhaTextField;

@end
