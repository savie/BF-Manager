.class public final synthetic Ll/֡ܿۙ;
.super Ljava/lang/Object;
.source "M8TF"

# interfaces
.implements Ll/ᩴۨۙ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/֡ܿۙ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܿۙ;->᩶:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ll/ᩳۗۙ;)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Ll/֡ܿۙ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/֡ܿۙ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/֡ܿۙ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/֡ܿۙ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ᩳۗۙ;

    .line 11
    check-cast p1, Ll/ᩴᩳۙ;

    .line 770
    invoke-interface {p1, v0}, Ll/ᩴᩳۙ;->ۙ(Ll/ᩳۗۙ;)V

    .line 771
    iget p1, v0, Ll/ᩳۗۙ;->ۤ:I

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/֡ܿۙ;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Ll/ۤۗۙ;

    .line 3222
    invoke-interface {p1, v0}, Ll/ۤۗۙ;->ۙ(Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
