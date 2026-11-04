.class public final synthetic Ll/ۨ֨֫;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/ܶۤۧ;


# instance fields
.field public final synthetic ܰ:Ll/֡֨֫;


# direct methods
.method public synthetic constructor <init>(Ll/֡֨֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ֨֫;->ܰ:Ll/֡֨֫;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Intent;I)V
    .locals 2

    const/4 v0, -0x1

    .line 1513
    iget-object v1, p0, Ll/ۨ֨֫;->ܰ:Ll/֡֨֫;

    if-eq p2, v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 1514
    :cond_0
    invoke-interface {v1}, Ll/֡֨֫;->ۙ()V

    return-void

    :cond_1
    if-eqz p1, :cond_2

    const-string p2, "path"

    .line 1516
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {v1, p1}, Ll/֡֨֫;->ۙ(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
