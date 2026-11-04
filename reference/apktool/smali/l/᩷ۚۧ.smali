.class public final synthetic Ll/᩷ۚۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/᩷ۚۧ;->ܰ:I

    iput-object p1, p0, Ll/᩷ۚۧ;->᩶:Ll/ܽ֡֫;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩷ۚۧ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/᩷ۚۧ;->᩶:Ll/ܽ֡֫;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۜ᩷᩻;

    .line 12
    invoke-static {v1}, Ll/ۜ᩷᩻;->ۙ(Ll/ۜ᩷᩻;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/֨֫ۧ;

    .line 17
    sget v0, Ll/֨֫ۧ;->ۡ᩷:I

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    sget v0, Ll/ܶ᩶ۧ;->ۨۙ:I

    const v0, 0x7f0d0047

    invoke-virtual {v1, v0}, Ll/֨֫ۧ;->᩸(I)V

    const v0, 0x7f0d0048

    .line 323
    invoke-virtual {v1, v0}, Ll/֨֫ۧ;->᩸(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
