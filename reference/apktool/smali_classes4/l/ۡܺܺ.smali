.class public final synthetic Ll/ۡܺܺ;
.super Ljava/lang/Object;
.source "A5XF"

# interfaces
.implements Ll/᩻ܶ᩵;
.implements Ll/ܶۤۧ;
.implements Ll/ܽۧܺ;
.implements Ll/ܰܽ;
.implements Ll/ۗܽۤ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡܺܺ;->ܰ:I

    iput-object p2, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩹ܽ᩵;

    check-cast p1, Ljava/lang/Void;

    return-object v0
.end method

.method public ۙ(I)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۡܺܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۘۧۧ;

    int-to-float p1, p1

    const v1, 0x3f666666    # 0.9f

    mul-float p1, p1, v1

    float-to-int p1, p1

    add-int/lit8 p1, p1, 0xa

    .line 1108
    invoke-interface {v0, p1}, Ll/ۘۧۧ;->ۙ(I)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۤܽ۫;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Landroid/content/Intent;I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿۛ᩸;

    invoke-static {v0, p2, p1}, Ll/ܿۛ᩸;->ۙ(Ll/ܿۛ᩸;ILandroid/content/Intent;)V

    return-void
.end method

.method public ۙ(Ll/ܿܽ;)V
    .locals 0

    .line 0
    iget p1, p0, Ll/ۡܺܺ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ܿܰۧ;

    invoke-static {p1}, Ll/ܿܰۧ;->ۙ(Ll/ܿܰۧ;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ᩳ᩺ۧ;

    invoke-static {p1}, Ll/ᩳ᩺ۧ;->᩷(Ll/ᩳ᩺ۧ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public ᩷(I)Ll/ܳܽۤ;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۡܺܺ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, [Ll/᩷ۨᩴ;

    .line 596
    aget-object p1, v0, p1

    const-string v0, "r"

    invoke-virtual {p1, v0}, Ll/᩷ۨᩴ;->֫(Ljava/lang/String;)Ll/ܳܽۤ;

    move-result-object p1

    return-object p1
.end method
