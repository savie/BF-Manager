.class public final synthetic Ll/ᩳ᩷;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ll/ᩴ֨᩵;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/ۗܺۙ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺۙ;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩳ᩷;->ܰ:I

    iput-object p1, p0, Ll/ᩳ᩷;->᩶:Ll/ۗܺۙ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ᩳ᩷;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ᩳ᩷;->᩶:Ll/ۗܺۙ;

    packed-switch v0, :pswitch_data_0

    .line 156
    invoke-static {v1}, Ll/ۙܺۙ;->ۙ(Ll/ۗܺۙ;)Ll/ۤܺۙ;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    check-cast v1, Ll/ۚۤ;

    sget v0, Ll/ۚۤ;->۫ۙ:I

    .line 162
    invoke-virtual {v1}, Ll/ۚۤ;->reportFullyDrawn()V

    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
