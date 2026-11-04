.class public Ll/ۙ᩹᩺;
.super Ljava/lang/Object;
.source "R5PD"

# interfaces
.implements Ll/۬֫ܶ;


# direct methods
.method public static ۙ(J)I
    .locals 4

    const/4 v0, 0x0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x7

    shr-long/2addr p0, v1

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-nez v3, :cond_0

    return v0
.end method

.method public static ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    if-eqz p0, :cond_4

    if-nez p1, :cond_1

    goto :goto_0

    .line 22
    :cond_1
    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_2

    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 23
    check-cast p0, [Ljava/lang/Object;

    .line 24
    check-cast p1, [Ljava/lang/Object;

    .line 25
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 27
    :cond_2
    instance-of v0, p0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    .line 28
    check-cast p0, Ljava/lang/CharSequence;

    check-cast p1, Ljava/lang/CharSequence;

    .line 70
    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0

    .line 30
    :cond_3
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public ֫(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ(Ll/᩺۫᩺;)V
    .locals 1

    .line 224
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 267
    :pswitch_0
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->ۧ(Ll/᩺۫᩺;)V

    return-void

    .line 258
    :pswitch_1
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->ܳ(Ll/᩺۫᩺;)V

    return-void

    .line 252
    :pswitch_2
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->᩷(Ll/᩺۫᩺;)V

    return-void

    .line 249
    :pswitch_3
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->᩸(Ll/᩺۫᩺;)V

    return-void

    .line 245
    :pswitch_4
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->ۚ(Ll/᩺۫᩺;)V

    return-void

    .line 242
    :pswitch_5
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->ᩴ(Ll/᩺۫᩺;)V

    return-void

    .line 239
    :pswitch_6
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->ۤ(Ll/᩺۫᩺;)V

    return-void

    .line 234
    :pswitch_7
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->᩻(Ll/᩺۫᩺;)V

    return-void

    .line 230
    :pswitch_8
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->۫(Ll/᩺۫᩺;)V

    return-void

    .line 227
    :pswitch_9
    invoke-virtual {p0, p1}, Ll/ۙ᩹᩺;->֫(Ll/᩺۫᩺;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ۚ(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۤ(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۧ(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۫(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ܳ(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩴ(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩷(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩸(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩻(Ll/᩺۫᩺;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
