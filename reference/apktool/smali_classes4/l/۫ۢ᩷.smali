.class public final synthetic Ll/۫ۢ᩷;
.super Ljava/lang/Object;
.source "H20Z"

# interfaces
.implements Ll/ᩴ֨᩵;


# instance fields
.field public final synthetic ܰ:Ll/֫ۢ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۢ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۢ᩷;->ܰ:Ll/֫ۢ᩷;

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 3

    .line 50
    iget-object v0, p0, Ll/۫ۢ᩷;->ܰ:Ll/֫ۢ᩷;

    invoke-interface {v0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    new-instance v2, Ll/᩷ۢ᩷;

    invoke-direct {v2, v0}, Ll/᩷ۢ᩷;-><init>(Ll/֫ۢ᩷;)V

    invoke-virtual {v1, v2}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object v0
.end method
