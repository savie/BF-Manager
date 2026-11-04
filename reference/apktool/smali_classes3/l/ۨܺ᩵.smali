.class public final Ll/ۨܺ᩵;
.super Ljava/lang/Object;
.source "Y8QO"


# instance fields
.field public final synthetic ۙ:I

.field public ۤ:Ljava/lang/Object;

.field public ᩷:Ljava/lang/Object;

.field public ᩸:I


# direct methods
.method public constructor <init>(Ll/֫᩻᩵;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/ۨܺ᩵;->ۙ:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    .line 33
    iput p2, p0, Ll/ۨܺ᩵;->᩸:I

    .line 34
    invoke-virtual {p1}, Ll/֫᩻᩵;->ۙ()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 59
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 60
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 34
    iput-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/ۨܺ᩵;->ۙ:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 28
    array-length v0, p1

    if-eqz v0, :cond_1

    .line 31
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [B

    .line 34
    iput-object p1, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    goto :goto_0

    .line 36
    :cond_0
    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    :goto_0
    const/16 p1, 0x20

    .line 39
    iput p1, p0, Ll/ۨܺ᩵;->᩸:I

    return-void

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Missing Seed for KDF"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۨܺ᩵;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 323
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SectionReader{buf="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨܺ᩵;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ֫()J
    .locals 2

    .line 100
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public ֫(I)[B
    .locals 1

    .line 120
    new-array p1, p1, [B

    .line 121
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public ۗ()I
    .locals 1

    .line 318
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    return v0
.end method

.method public ۙ(Ll/ܺܺ᩵;I)I
    .locals 2

    .line 189
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺ᩵;->᩸()I

    move-result v0

    mul-int/lit8 p2, p2, 0x8

    add-int/2addr p2, v0

    .line 190
    invoke-virtual {p0, p2}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 191
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    .line 192
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v0

    .line 96
    iget-object v1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 194
    invoke-virtual {p0, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܺܺ᩵;->ۤ(Ljava/lang/String;)V

    .line 195
    invoke-virtual {p0, v1}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܺܺ᩵;->ۙ(Ljava/lang/String;)V

    return p2
.end method

.method public ۙ(ILl/ۨܺ᩵;)Ll/֡᩶ۗ;
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺ᩵;->ۙ()I

    move-result v0

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    .line 207
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 96
    iget-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    .line 208
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 209
    new-instance p1, Ll/֡᩶ۗ;

    invoke-static {p0, p2}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/֡᩶ۗ;-><init>(Ljava/util/ArrayList;)V

    return-object p1
.end method

.method public ۙ()Ll/ۨܺ᩵;
    .locals 3

    .line 42
    new-instance v0, Ll/ۨܺ᩵;

    iget v1, p0, Ll/ۨܺ᩵;->᩸:I

    .line 38
    iget-object v2, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v2, Ll/֫᩻᩵;

    invoke-direct {v0, v2, v1}, Ll/ۨܺ᩵;-><init>(Ll/֫᩻᩵;I)V

    return-object v0
.end method

.method public ۙ(I)V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public ۙ(ILl/᩵ܺ᩵;)V
    .locals 1

    .line 250
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {p2, v0, p1}, Ll/᩵ܺ᩵;->ۙ(Ll/֫᩻᩵;I)V

    .line 251
    invoke-virtual {p2, p1}, Ll/᩵ܺ᩵;->ۙ(I)V

    .line 252
    invoke-virtual {p2, p0}, Ll/᩵ܺ᩵;->ۙ(Ll/ۨܺ᩵;)V

    return-void
.end method

.method public ۚ()I
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    return v0
.end method

.method public ۚ(I)V
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget v1, p0, Ll/ۨܺ᩵;->᩸:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public ۤ()I
    .locals 1

    .line 51
    iget v0, p0, Ll/ۨܺ᩵;->᩸:I

    return v0
.end method

.method public ۤ(I)Ll/۠ܰۗ;
    .locals 4

    .line 213
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺ᩵;->ᩴ()I

    move-result v0

    mul-int/lit8 p1, p1, 0x8

    add-int/2addr p1, v0

    .line 214
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 215
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    .line 245
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown method handle type: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, p1}, Ll/ۙۡۙ;->ۙ(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    .line 245
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :pswitch_0
    sget-object p1, Ll/᩷᩶ۗ;->ۢ:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 241
    :pswitch_1
    sget-object p1, Ll/᩷᩶ۗ;->۟:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 239
    :pswitch_2
    sget-object p1, Ll/᩷᩶ۗ;->֡:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 237
    :pswitch_3
    sget-object p1, Ll/᩷᩶ۗ;->ᩳ:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 235
    :pswitch_4
    sget-object p1, Ll/᩷᩶ۗ;->֨:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 233
    :pswitch_5
    sget-object p1, Ll/᩷᩶ۗ;->᩶:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 231
    :pswitch_6
    sget-object p1, Ll/᩷᩶ۗ;->ܿ:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 229
    :pswitch_7
    sget-object p1, Ll/᩷᩶ۗ;->ۡ:Ll/᩷᩶ۗ;

    goto :goto_0

    .line 227
    :pswitch_8
    sget-object p1, Ll/᩷᩶ۗ;->ۖ:Ll/᩷᩶ۗ;

    :goto_0
    const/4 v0, 0x2

    .line 216
    invoke-virtual {p0, v0}, Ll/ۨܺ᩵;->᩻(I)V

    .line 217
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v0

    .line 218
    invoke-virtual {p1}, Ll/᩷᩶ۗ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 219
    new-instance v1, Ll/֨᩶ۗ;

    .line 182
    new-instance v2, Ll/ܺܺ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܺܺ᩵;-><init>(Ll/ۛܺ᩵;)V

    .line 183
    invoke-virtual {p0, v2, v0}, Ll/ۨܺ᩵;->ۙ(Ll/ܺܺ᩵;I)I

    move-result v0

    .line 184
    invoke-virtual {p0, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ܺܺ᩵;->᩷(Ljava/lang/String;)V

    .line 219
    invoke-direct {v1, p1, v2}, Ll/֨᩶ۗ;-><init>(Ll/᩷᩶ۗ;Ll/ܺܺ᩵;)V

    return-object v1

    .line 221
    :cond_0
    new-instance v1, Ll/ۖ᩶ۗ;

    .line 200
    new-instance v2, Ll/᩵ܺ᩵;

    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 201
    invoke-virtual {p0, v0, v2}, Ll/ۨܺ᩵;->ۙ(ILl/᩵ܺ᩵;)V

    .line 221
    invoke-direct {v1, p1, v2}, Ll/ۖ᩶ۗ;-><init>(Ll/᩷᩶ۗ;Ll/᩵ܺ᩵;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۧ()I
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    return v0
.end method

.method public ۧ(I)V
    .locals 0

    .line 65
    iput p1, p0, Ll/ۨܺ᩵;->᩸:I

    return-void
.end method

.method public ۫()B
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    return v0
.end method

.method public ۫(I)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 162
    :cond_0
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺ᩵;->֫()I

    move-result v0

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    .line 163
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 96
    iget-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    .line 165
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ܳ(I)Ljava/lang/String;
    .locals 7

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 174
    :cond_0
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺ᩵;->ۚ()I

    move-result v0

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    .line 175
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 96
    iget-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    .line 177
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 306
    invoke-static {p0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result p1

    .line 10
    new-array p1, p1, [C

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    if-nez v2, :cond_1

    .line 15
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1, v0, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    .line 17
    :cond_1
    aput-char v2, p1, v1

    const/16 v3, 0x80

    if-ge v2, v3, :cond_2

    goto :goto_1

    :cond_2
    and-int/lit16 v4, v2, 0xe0

    const/16 v5, 0xc0

    if-ne v4, v5, :cond_4

    .line 21
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v4

    and-int/lit16 v5, v4, 0xc0

    if-ne v5, v3, :cond_3

    and-int/lit8 v2, v2, 0x1f

    shl-int/lit8 v2, v2, 0x6

    and-int/lit8 v3, v4, 0x3f

    or-int/2addr v2, v3

    int-to-char v2, v2

    .line 25
    aput-char v2, p1, v1

    goto :goto_1

    .line 23
    :cond_3
    new-instance p1, Ll/۬ۧ᩵;

    const-string v0, "Bad second byte"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1

    :cond_4
    and-int/lit16 v4, v2, 0xf0

    const/16 v5, 0xe0

    if-ne v4, v5, :cond_6

    .line 28
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v4

    .line 29
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v5

    and-int/lit16 v6, v4, 0xc0

    if-ne v6, v3, :cond_5

    and-int/lit16 v6, v5, 0xc0

    if-ne v6, v3, :cond_5

    and-int/lit8 v2, v2, 0xf

    shl-int/lit8 v2, v2, 0xc

    and-int/lit8 v3, v4, 0x3f

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    and-int/lit8 v3, v5, 0x3f

    or-int/2addr v2, v3

    int-to-char v2, v2

    .line 33
    aput-char v2, p1, v1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 31
    :cond_5
    new-instance p1, Ll/۬ۧ᩵;

    const-string v0, "Bad second or third byte"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 31
    throw p1

    .line 36
    :cond_6
    new-instance p1, Ll/۬ۧ᩵;

    const-string v0, "Bad byte"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 36
    throw p1
.end method

.method public ܳ()[B
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, [B

    return-object v0
.end method

.method public ܶ()I
    .locals 2

    .line 112
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method public ܺ()Ljava/util/List;
    .locals 5

    .line 96
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    if-nez v0, :cond_0

    .line 147
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 126
    :cond_0
    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 128
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 150
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v2, v0, :cond_2

    .line 151
    aget v4, v1, v2

    .line 152
    invoke-virtual {p0, v4}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v3
.end method

.method public ܽ()I
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public ᩴ(I)Ll/ۗܺ᩵;
    .locals 3

    .line 277
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺ᩵;->۫()I

    move-result v0

    mul-int/lit8 p1, p1, 0xc

    add-int/2addr p1, v0

    .line 278
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    const/4 p1, 0x4

    .line 279
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->᩻(I)V

    .line 96
    iget-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 282
    new-instance v2, Ll/ۗܺ᩵;

    if-nez v1, :cond_0

    .line 139
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 141
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܺ()Ljava/util/List;

    move-result-object p1

    .line 282
    :goto_0
    invoke-virtual {p0, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Ll/ۗܺ᩵;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v2
.end method

.method public ᩴ()[B
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, [B

    return-object v0
.end method

.method public ᩷()I
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    return v0
.end method

.method public ᩷(I)Ll/ۨܺ᩵;
    .locals 2

    .line 46
    new-instance v0, Ll/ۨܺ᩵;

    .line 38
    iget-object v1, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v1, Ll/֫᩻᩵;

    invoke-direct {v0, v1, p1}, Ll/ۨܺ᩵;-><init>(Ll/֫᩻᩵;I)V

    return-object v0
.end method

.method public ᩷(ILl/᩵ܺ᩵;)V
    .locals 4

    .line 256
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    .line 257
    invoke-virtual {v0}, Ll/ܽܺ᩵;->ܳ()I

    move-result v1

    mul-int/lit8 p1, p1, 0x8

    add-int/2addr p1, v1

    .line 258
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 259
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result p1

    .line 260
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result v1

    .line 96
    iget-object v2, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 263
    invoke-virtual {v0}, Ll/ܽܺ᩵;->۫()I

    move-result v0

    mul-int/lit8 v1, v1, 0xc

    add-int/2addr v1, v0

    .line 264
    invoke-virtual {p0, v1}, Ll/ۨܺ᩵;->ۙ(I)V

    const/4 v0, 0x4

    .line 265
    invoke-virtual {p0, v0}, Ll/ۨܺ᩵;->᩻(I)V

    .line 96
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    if-nez v1, :cond_0

    .line 139
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 141
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܺ()Ljava/util/List;

    move-result-object v1

    .line 270
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/᩵ܺ᩵;->᩷(Ljava/lang/String;)V

    .line 271
    invoke-virtual {p0, v3}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/᩵ܺ᩵;->ۙ(Ljava/lang/String;)V

    .line 272
    invoke-virtual {p0, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/᩵ܺ᩵;->ۤ(Ljava/lang/String;)V

    .line 273
    invoke-virtual {p2, v1}, Ll/᩵ܺ᩵;->ۙ(Ljava/util/List;)V

    return-void
.end method

.method public ᩸(I)Ljava/util/List;
    .locals 2

    .line 286
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    invoke-virtual {v0}, Ll/֫᩻᩵;->᩷()Ll/ܽܺ᩵;

    move-result-object v0

    .line 287
    invoke-virtual {v0}, Ll/ܽܺ᩵;->ܳ()I

    move-result v1

    mul-int/lit8 p1, p1, 0x8

    add-int/2addr p1, v1

    add-int/lit8 p1, p1, 0x2

    .line 288
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 289
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܶ()I

    move-result p1

    .line 291
    invoke-virtual {v0}, Ll/ܽܺ᩵;->۫()I

    move-result v0

    mul-int/lit8 p1, p1, 0xc

    add-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x8

    .line 292
    invoke-virtual {p0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 96
    iget-object p1, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    if-nez v0, :cond_0

    .line 296
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 82
    :cond_0
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 298
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܺ()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ᩸()Ll/֫᩻᩵;
    .locals 1

    .line 302
    iget-object v0, p0, Ll/ۨܺ᩵;->ۤ:Ljava/lang/Object;

    check-cast v0, Ll/֫᩻᩵;

    return-object v0
.end method

.method public ᩹()V
    .locals 1

    .line 73
    iget v0, p0, Ll/ۨܺ᩵;->᩸:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/ۨܺ᩵;->᩸:I

    return-void
.end method

.method public ᩻()I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 14
    :cond_0
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    mul-int/lit8 v5, v1, 0x7

    shl-int/2addr v4, v5

    or-int/2addr v0, v4

    shl-int/lit8 v2, v2, 0x7

    add-int/lit8 v1, v1, 0x1

    const/16 v4, 0x80

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_1

    const/4 v5, 0x5

    if-lt v1, v5, :cond_0

    :cond_1
    if-eq v3, v4, :cond_3

    shr-int/lit8 v1, v2, 0x1

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    or-int/2addr v0, v2

    :cond_2
    return v0

    .line 21
    :cond_3
    new-instance v0, Ll/۬ۧ᩵;

    const-string v1, "Invalid LEB128 sequence"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 21
    throw v0
.end method

.method public ᩻(I)V
    .locals 2

    .line 91
    iget-object v0, p0, Ll/ۨܺ᩵;->᩷:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, p1

    .line 92
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method
