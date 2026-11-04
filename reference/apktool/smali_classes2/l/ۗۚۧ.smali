.class public final synthetic Ll/ۗۚۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic ܰ:Ll/֨֫ۧ;

.field public final synthetic ܿ:[Z

.field public final synthetic ᩶:Ljava/io/IOException;


# direct methods
.method public synthetic constructor <init>(Ll/֨֫ۧ;Ljava/io/IOException;[ZLjava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۚۧ;->ܰ:Ll/֨֫ۧ;

    iput-object p2, p0, Ll/ۗۚۧ;->᩶:Ljava/io/IOException;

    iput-object p3, p0, Ll/ۗۚۧ;->ܿ:[Z

    iput-object p4, p0, Ll/ۗۚۧ;->֡:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 2
    sget v0, Ll/֨֫ۧ;->ۡ᩷:I

    .line 889
    iget-object v0, p0, Ll/ۗۚۧ;->ܰ:Ll/֨֫ۧ;

    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v2, 0x7f120310

    invoke-virtual {v1, v2}, Ll/ۖۖۧ;->᩷(I)V

    .line 890
    iget-object v2, p0, Ll/ۗۚۧ;->᩶:Ljava/io/IOException;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v3, Ll/ۛۚۧ;

    const/4 v4, 0x0

    iget-object v5, p0, Ll/ۗۚۧ;->ܿ:[Z

    iget-object v6, p0, Ll/ۗۚۧ;->֡:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v3, v4, v5, v6}, Ll/ۛۚۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x7f120496

    .line 891
    invoke-virtual {v1, v7, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/᩺ۚۧ;

    invoke-direct {v3, v4, v5, v6}, Ll/᩺ۚۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x7f12018c

    .line 895
    invoke-virtual {v1, v5, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f12030d

    const/4 v5, 0x0

    .line 899
    invoke-virtual {v1, v3, v5}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 900
    invoke-virtual {v1, v4}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 901
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    .line 902
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v1

    new-instance v3, Ll/۠ۙ֫;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v0, v2}, Ll/۠ۙ֫;-><init>(ILl/ۤ᩻ۙ;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
