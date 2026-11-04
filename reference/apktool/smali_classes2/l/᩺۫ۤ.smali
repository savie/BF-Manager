.class public final Ll/᩺۫ۤ;
.super Ll/ᩴ᩸ۤ;
.source "24MP"


# instance fields
.field public final ֡:Ll/۠۫ۤ;

.field public final ܿ:[Ll/۟۫ۤ;

.field public final ᩶:Ll/᩶ۚۤ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 34
    new-instance v0, Ll/ۗۚۤ;

    const/4 v1, 0x0

    .line 51
    invoke-static {p1, v1}, Ll/᩵֫ܺ;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ll/ۗۚۤ;-><init>([B)V

    invoke-direct {p0, v0}, Ll/᩺۫ۤ;-><init>(Ll/᩶ۚۤ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩶ۚۤ;)V
    .locals 7

    .line 47
    invoke-direct {p0}, Ll/ᩴ᩸ۤ;-><init>()V

    .line 48
    iput-object p1, p0, Ll/᩺۫ۤ;->᩶:Ll/᩶ۚۤ;

    const/4 v0, 0x0

    .line 50
    :try_start_0
    invoke-virtual {p1, v0}, Ll/᩶ۚۤ;->۫(I)Ll/ܺۚۤ;

    move-result-object v1

    invoke-static {v1}, Ll/ۡۤۤ;->ۙ(Ll/ܺۚۤ;)Ll/ۡۤۤ;

    move-result-object v1

    .line 55
    iget v1, v1, Ll/ۡۤۤ;->᩷:I

    invoke-virtual {p1, v1}, Ll/᩶ۚۤ;->۫(I)Ll/ܺۚۤ;

    move-result-object v1

    .line 56
    :goto_0
    invoke-virtual {v1}, Ll/ܺۚۤ;->ۙ()I

    move-result v2

    const/16 v3, 0x8

    if-lt v2, v3, :cond_2

    .line 57
    invoke-static {v1}, Ll/ۡۤۤ;->ۙ(Ll/ܺۚۤ;)Ll/ۡۤۤ;

    move-result-object v2

    iget v4, v2, Ll/ۡۤۤ;->ۙ:I

    .line 58
    iget-short v5, v2, Ll/ۡۤۤ;->᩸:S

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    const/4 v2, -0x8

    .line 59
    invoke-virtual {v1, v2}, Ll/ܺۚۤ;->᩸(I)V

    goto :goto_1

    .line 63
    :cond_0
    iget v5, v2, Ll/ۡۤۤ;->᩷:I

    if-lt v5, v3, :cond_1

    if-lt v4, v5, :cond_1

    add-int/lit8 v4, v4, -0x8

    .line 64
    invoke-virtual {v1}, Ll/ܺۚۤ;->ۙ()I

    move-result v3

    if-gt v4, v3, :cond_1

    .line 67
    invoke-virtual {v1, v4}, Ll/ܺۚۤ;->᩸(I)V

    goto :goto_0

    .line 65
    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid chunk size before string pool at offset "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v2, Ll/ۡۤۤ;->ۤ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_2
    :goto_1
    new-instance v2, Ll/۠۫ۤ;

    invoke-direct {v2, v1}, Ll/۠۫ۤ;-><init>(Ll/ܺۚۤ;)V

    iput-object v2, p0, Ll/᩺۫ۤ;->֡:Ll/۠۫ۤ;

    .line 71
    invoke-virtual {v1}, Ll/ܺۚۤ;->᩷()I

    move-result v2

    invoke-static {p1, v2}, Ll/ۢۤۤ;->ۙ(Ll/᩶ۚۤ;I)Ll/ܿۤۤ;

    move-result-object v2

    iput-object v2, p0, Ll/ᩴ᩸ۤ;->ܰ:Ll/ܿۤۤ;

    .line 73
    invoke-virtual {p1, v3}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result p1

    if-gez p1, :cond_3

    const/16 p1, 0xa

    .line 77
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Ll/᩻ۚۤ; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, p1, :cond_6

    .line 80
    :try_start_1
    new-instance v4, Ll/۟۫ۤ;

    invoke-direct {v4, p0, v1}, Ll/۟۫ۤ;-><init>(Ll/᩺۫ۤ;Ll/ܺۚۤ;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ll/᩻ۚۤ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v4

    if-eqz v3, :cond_5

    .line 86
    :try_start_2
    invoke-virtual {v1}, Ll/ܺۚۤ;->ۙ()I

    move-result v4

    if-gtz v4, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 85
    :cond_5
    throw v4

    :catch_1
    move-exception p1

    .line 82
    throw p1

    :cond_6
    :goto_4
    new-array p1, v0, [Ll/۟۫ۤ;

    .line 91
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/۟۫ۤ;

    iput-object p1, p0, Ll/᩺۫ۤ;->ܿ:[Ll/۟۫ۤ;
    :try_end_2
    .catch Ll/᩻ۚۤ; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    .line 93
    invoke-virtual {p1}, Ll/᩻ۚۤ;->getCause()Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public constructor <init>(Ll/᩷ۨᩴ;)V
    .locals 0

    .line 30
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܶ᩷()[B

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩺۫ۤ;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 38
    new-instance v0, Ll/ۗۚۤ;

    invoke-direct {v0, p1}, Ll/ۗۚۤ;-><init>([B)V

    invoke-direct {p0, v0}, Ll/᩺۫ۤ;-><init>(Ll/᩶ۚۤ;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/io/OutputStream;)V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/᩺۫ۤ;->᩶:Ll/᩶ۚۤ;

    invoke-virtual {v0, p1}, Ll/᩶ۚۤ;->ۙ(Ljava/io/OutputStream;)V

    return-void
.end method

.method public final ۚ()V
    .locals 4

    .line 106
    iget-object v0, p0, Ll/᩺۫ۤ;->֡:Ll/۠۫ۤ;

    invoke-virtual {v0}, Ll/۠۫ۤ;->᩸()V

    .line 107
    iget-object v0, p0, Ll/᩺۫ۤ;->ܿ:[Ll/۟۫ۤ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 108
    iget-object v3, v3, Ll/۟۫ۤ;->ۢ:Ll/۠۫ۤ;

    invoke-virtual {v3}, Ll/۠۫ۤ;->᩸()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(I)Ll/ۤ۫ۤ;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/᩺۫ۤ;->ܿ:[Ll/۟۫ۤ;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۨ()I
    .locals 1

    .line 121
    iget-object v0, p0, Ll/᩺۫ۤ;->ܿ:[Ll/۟۫ۤ;

    array-length v0, v0

    return v0
.end method

.method public final ۫᩷()Ll/ۗ۫ۤ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/᩺۫ۤ;->֡:Ll/۠۫ۤ;

    return-object v0
.end method

.method public final ۫᩷()Ll/۠۫ۤ;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/᩺۫ۤ;->֡:Ll/۠۫ۤ;

    return-object v0
.end method

.method public final ܳ()V
    .locals 6

    .line 135
    invoke-static {}, Ll/᩸ᩴۤ;->ۗ()Ll/᩸ᩴۤ;

    move-result-object v0

    .line 136
    iget-object v1, p0, Ll/᩺۫ۤ;->ܿ:[Ll/۟۫ۤ;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 137
    invoke-virtual {v4}, Ll/ܶ᩸ۤ;->۫()I

    move-result v5

    invoke-virtual {v4}, Ll/ܶ᩸ۤ;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Ll/᩸ᩴۤ;->ۙ(ILjava/lang/String;)Ll/᩻ᩴۤ;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
