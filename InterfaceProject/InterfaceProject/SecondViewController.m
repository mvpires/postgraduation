//
//  SecondViewController.m
//  InterfaceProject
//
//  Created by Treinamento on 29/07/17.
//  Copyright © 2017 Treinamento. All rights reserved.
//

#import "SecondViewController.h"
#import "CustomTableViewCell.h"

@interface SecondViewController ()

@end

@implementation SecondViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.array = @[@"Segunda", @"Terça", @"Quarta", @"Quinta", @"Sexta"];
    
    NSDictionary *dictionary = @{@"nome":@"nomeTeste",
                                 @"email":@"emailTeste",
                                 @"rua":@"ruaTeste",
                                 @"pais":@"paísTeste"};
    
    NSDictionary *dictionary2 = @{@"nome":@"nomeTeste2",
                                 @"email":@"emailTeste2",
                                 @"rua":@"ruaTeste2",
                                 @"pais":@"paísTeste2"};
    
    self.array = @[dictionary, dictionary2];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(NSInteger)numberOfSectionsInTableView:(UITableView *)tableView{
    return 1;
}

-(NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section{
    return self.array.count;
}

-(UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath{

    CustomTableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:@"customCell" forIndexPath:indexPath];
    
    NSDictionary *dic = self.array[indexPath.row];
    
    cell.nomeLabel.text = dic[@"nome"];
    cell.emailLabel.text = dic[@"email"];
    cell.ruaLabel.text = dic[@"rua"];
    cell.countryLabel.text = dic[@"país"];
    
//    cell.textLabel.text = self.array[indexPath.row];
    
    return cell;
    
}


-(void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath{
    [tableView deselectRowAtIndexPath:indexPath animated:YES];
}


/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
