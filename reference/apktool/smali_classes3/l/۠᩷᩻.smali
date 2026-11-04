.class public abstract Ll/۠᩷᩻;
.super Ljava/lang/Object;
.source "A1UM"


# instance fields
.field public final synthetic ۙ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠᩷᩻;->ۙ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/۠᩷᩻;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 167
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ۙ(I)D
.end method

.method public abstract ۙ(ID)D
.end method

.method public abstract ۙ()I
.end method

.method public abstract ۙ(II[B[B)I
.end method

.method public abstract ۙ(I[B)V
.end method

.method public abstract ۙ(Ljava/lang/String;)V
.end method

.method public abstract ۤ()V
.end method

.method public abstract ᩴ()V
.end method

.method public ᩷()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩷(Ljava/lang/String;)V
    .locals 1

    .line 14
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 15
    array-length v0, p1

    invoke-virtual {p0, v0, p1}, Ll/۠᩷᩻;->ۙ(I[B)V

    return-void
.end method

.method public abstract ᩸()V
.end method
