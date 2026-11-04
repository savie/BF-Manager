.class public final Ll/ۢᩳۗ;
.super Ljava/lang/Object;
.source "QIY2"


# instance fields
.field public final ۙ:I

.field public final ᩷:Ll/ᩳᩳۗ;


# direct methods
.method public constructor <init>(ILl/ᩳᩳۗ;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput p1, p0, Ll/ۢᩳۗ;->ۙ:I

    .line 22
    iput-object p2, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    return-void
.end method

.method public static ۤ(I)I
    .locals 3

    const/4 v0, 0x2

    if-eqz p0, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq p0, v2, :cond_2

    if-eq p0, v0, :cond_1

    if-ne p0, v1, :cond_0

    const/4 p0, 0x3

    return p0

    .line 87
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Unexpected visibility flag: "

    .line 0
    invoke-static {p0, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v0

    :cond_1
    return v2

    :cond_2
    return v1

    :cond_3
    return v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 272
    instance-of v0, p1, Ll/ۢᩳۗ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 273
    check-cast p1, Ll/ۢᩳۗ;

    .line 274
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    iget v2, p1, Ll/ۢᩳۗ;->ۙ:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    iget-object p1, p1, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 281
    iget-object v0, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۢᩳۗ;->ۙ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessInfo: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۢᩳۗ;->ۙ:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ll/ۢᩳۗ;->ۙ(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    .line 164
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۗ()Z
    .locals 1

    .line 140
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(Z)Ljava/lang/String;
    .locals 4

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    invoke-virtual {p0}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "public "

    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    :cond_0
    invoke-virtual {p0}, Ll/ۢᩳۗ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "private "

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    :cond_1
    invoke-virtual {p0}, Ll/ۢᩳۗ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "protected "

    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    :cond_2
    invoke-virtual {p0}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "static "

    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    :cond_3
    invoke-virtual {p0}, Ll/ۢᩳۗ;->۫()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "final "

    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    :cond_4
    iget v1, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_5

    const-string v2, "abstract "

    .line 193
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_6

    const-string v2, "native "

    .line 196
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    :cond_6
    iget-object v2, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_b

    const/4 v3, 0x1

    if-eq v2, v3, :cond_9

    const/4 v1, 0x2

    if-eq v2, v1, :cond_7

    goto :goto_0

    .line 200
    :cond_7
    invoke-virtual {p0}, Ll/ۢᩳۗ;->᩹()Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "synchronized "

    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    if-eqz p1, :cond_e

    .line 204
    invoke-virtual {p0}, Ll/ۢᩳۗ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "/* bridge */ "

    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_9
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_a

    const-string v2, "volatile "

    .line 215
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_e

    const-string v1, "transient "

    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_b
    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_c

    const-string v2, "strict "

    .line 224
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    if-eqz p1, :cond_e

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    if-eqz v1, :cond_d

    const-string v1, "/* data */ "

    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    :cond_d
    invoke-virtual {p0}, Ll/ۢᩳۗ;->֫()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "/* module-info */ "

    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    :cond_e
    :goto_0
    invoke-virtual {p0}, Ll/ۢᩳۗ;->ۗ()Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz p1, :cond_f

    const-string p1, "/* synthetic */ "

    .line 245
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    :cond_f
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()Ll/ۢᩳۗ;
    .locals 3

    .line 27
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    return-object p0

    .line 49
    :cond_0
    new-instance v1, Ll/ۢᩳۗ;

    or-int/lit8 v0, v0, 0x8

    iget-object v2, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-direct {v1, v0, v2}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    return-object v1
.end method

.method public final ۙ(I)Ll/ۢᩳۗ;
    .locals 2

    .line 55
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v1, v0, 0x7

    if-ne v1, p1, :cond_0

    return-object p0

    :cond_0
    and-int/lit8 v0, v0, -0x8

    .line 60
    new-instance v1, Ll/ۢᩳۗ;

    or-int/2addr p1, v0

    iget-object v0, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-direct {v1, p1, v0}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    return-object v1
.end method

.method public final ۙ(Ll/ۢᩳۗ;)Z
    .locals 1

    .line 68
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x7

    .line 69
    iget p1, p1, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 p1, p1, 0x7

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    invoke-static {v0}, Ll/ۢᩳۗ;->ۤ(I)I

    move-result v0

    invoke-static {p1}, Ll/ۢᩳۗ;->ۤ(I)I

    move-result p1

    if-ge v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final varargs ۙ([I)Z
    .locals 5

    .line 32
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    .line 33
    iget v4, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/2addr v3, v4

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۚ()Z
    .locals 1

    .line 112
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 116
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 104
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x7

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۨ()I
    .locals 1

    .line 267
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    return v0
.end method

.method public final ۫()Z
    .locals 1

    .line 128
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 136
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 124
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 96
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 92
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()Z
    .locals 2

    .line 132
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 148
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/ۢᩳۗ;
    .locals 3

    .line 64
    new-instance v0, Ll/ۢᩳۗ;

    iget v1, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v1, v1, 0x7

    iget-object v2, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-direct {v0, v1, v2}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    return-object v0
.end method

.method public final ᩷(I)Ll/ۢᩳۗ;
    .locals 2

    .line 27
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int v1, v0, p1

    if-eqz v1, :cond_0

    .line 42
    new-instance v1, Ll/ۢᩳۗ;

    not-int p1, p1

    and-int/2addr p1, v0

    iget-object v0, p0, Ll/ۢᩳۗ;->᩷:Ll/ᩳᩳۗ;

    invoke-direct {v1, p1, v0}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    return-object v1

    :cond_0
    return-object p0
.end method

.method public final ᩸()Z
    .locals 1

    .line 144
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩹()Z
    .locals 2

    .line 152
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    const v1, 0x20020

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 100
    iget v0, p0, Ll/ۢᩳۗ;->ۙ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
