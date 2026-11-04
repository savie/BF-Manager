.class public final synthetic Ll/ۖܶ᩸;
.super Ljava/lang/Object;
.source "36NN"

# interfaces
.implements Ll/ܳۨۙ;
.implements Ll/ᩴۨۙ;
.implements Ll/ۨۡۙ;
.implements Ll/᩻ܶ᩵;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖܶ᩸;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/۠ܿۙ;)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/ۖܶ᩸;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ll/ۜ᩹ۙ;)V
    .locals 0

    const/4 p1, 0x4

    .line 0
    iput p1, p0, Ll/ۖܶ᩸;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Z)V
    .locals 0

    const/4 p1, 0x5

    .line 0
    iput p1, p0, Ll/ۖܶ᩸;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr p3, p4

    return p3
.end method

.method public static ۙ(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/util/ArrayList;I)V
    .locals 1

    .line 0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ll/ۖܶ᩸;->ܰ:I

    check-cast p1, Ll/ᩴᩳۙ;

    packed-switch v0, :pswitch_data_0

    .line 741
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 662
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Ljava/util/UUID;)Ll/᩺ۡۙ;
    .locals 0

    .line 0
    invoke-static {p1}, Ll/ܿۡۙ;->ۙ(Ljava/util/UUID;)Ll/᩺ۡۙ;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ljava/lang/Object;Ll/᩸᩹ۙ;)V
    .locals 1

    check-cast p1, Ll/ۤۗۙ;

    .line 301
    new-instance v0, Ll/᩷ۗۙ;

    invoke-direct {v0, p2}, Ll/᩷ۗۙ;-><init>(Ll/᩸᩹ۙ;)V

    invoke-interface {p1, v0}, Ll/ۤۗۙ;->ۙ(Ll/᩷ۗۙ;)V

    return-void
.end method
