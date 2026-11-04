.class public final Ll/᩸ܺۤ;
.super Ljava/lang/Object;
.source "X55S"


# instance fields
.field public final synthetic ۙ:I

.field public final ᩷:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ll/᩸ܺۤ;->ۙ:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ܽۢۗ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/᩸ܺۤ;->ۙ:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v0, Ll/֫۟ۗ;->ۨۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 13
    iput-object p1, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 2
    iget v0, p0, Ll/᩸ܺۤ;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 43
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩸ܺۤ;->ۙ()Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    iget-object v1, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v1, Ll/ܽۢۗ;

    invoke-virtual {v1}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ll/ܶۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩸ܺۤ;->᩷()Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ()Ll/ܺ֨ۗ;
    .locals 2

    .line 21
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢۗ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public ۤ()Ll/ܽۢۗ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢۗ;

    return-object v0
.end method

.method public ۫()[B
    .locals 1

    .line 18
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public ܳ()V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢۗ;

    invoke-virtual {v0}, Ll/ܽۢۗ;->normalize()V

    return-void
.end method

.method public ᩴ()V
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢۗ;

    invoke-virtual {v0}, Ll/ܽۢۗ;->᩶ۙ()V

    return-void
.end method

.method public ᩷()Ll/ܺ֨ۗ;
    .locals 2

    .line 25
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢۗ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public ᩸()Ll/ܶۢۗ;
    .locals 1

    .line 17
    iget-object v0, p0, Ll/᩸ܺۤ;->᩷:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢۗ;

    invoke-virtual {v0}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v0

    return-object v0
.end method
