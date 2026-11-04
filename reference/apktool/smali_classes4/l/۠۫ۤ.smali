.class public final Ll/۠۫ۤ;
.super Ll/ۙᩴۤ;
.source "X4NP"


# instance fields
.field public final ֫:I

.field public final ۗ:I

.field public final ۚ:I

.field public ۧ:Z

.field public ۨ:[I

.field public ۫:Ll/ܳܰ᩹;

.field public final ܳ:Ljava/lang/Object;

.field public final ܶ:I

.field public ܺ:[Ll/ۖ۫ۤ;

.field public ܽ:I

.field public final ᩴ:Ll/᩶ۚۤ;

.field public ᩵:I

.field public ᩸:I

.field public ᩹:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܺۚۤ;)V
    .locals 12

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۠۫ۤ;->ܳ:Ljava/lang/Object;

    .line 48
    iget-object v0, p1, Ll/ܺۚۤ;->ۙ:Ll/᩶ۚۤ;

    iput-object v0, p0, Ll/۠۫ۤ;->ᩴ:Ll/᩶ۚۤ;

    .line 49
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩷()I

    move-result v1

    iput v1, p0, Ll/۠۫ۤ;->᩸:I

    .line 51
    invoke-static {p1}, Ll/ۡۤۤ;->ۙ(Ll/ܺۚۤ;)Ll/ۡۤۤ;

    move-result-object v1

    .line 52
    iget-short v2, v1, Ll/ۡۤۤ;->᩸:S

    if-nez v2, :cond_0

    .line 53
    iget v1, v1, Ll/ۡۤۤ;->ۙ:I

    add-int/lit8 v1, v1, -0x8

    invoke-virtual {p1, v1}, Ll/ܺۚۤ;->᩸(I)V

    .line 54
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩷()I

    move-result v1

    iput v1, p0, Ll/۠۫ۤ;->᩸:I

    .line 55
    invoke-static {p1}, Ll/ۡۤۤ;->ۙ(Ll/ܺۚۤ;)Ll/ۡۤۤ;

    move-result-object v1

    .line 57
    :cond_0
    iget v2, v1, Ll/ۡۤۤ;->᩷:I

    iget v3, v1, Ll/ۡۤۤ;->ۙ:I

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ll/ۡۤۤ;->ۙ(I)V

    .line 59
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩸()I

    move-result v1

    .line 60
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩸()I

    move-result v5

    iput v5, p0, Ll/۠۫ۤ;->᩹:I

    .line 61
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩸()I

    move-result v6

    .line 62
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩸()I

    move-result v7

    .line 63
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩸()I

    move-result v8

    iput v8, p0, Ll/۠۫ۤ;->᩵:I

    const/16 v9, 0x1c

    if-le v2, v9, :cond_1

    add-int/lit8 v9, v2, -0x1c

    .line 65
    invoke-virtual {p1, v9}, Ll/ܺۚۤ;->᩸(I)V

    :cond_1
    if-ge v7, v2, :cond_2

    move v7, v2

    :cond_2
    const/4 v9, 0x0

    if-eqz v5, :cond_3

    if-nez v8, :cond_5

    :cond_3
    if-ltz v1, :cond_4

    mul-int/lit8 v5, v1, 0x4

    add-int/2addr v5, v2

    if-le v5, v7, :cond_5

    .line 73
    :cond_4
    iput v9, p0, Ll/۠۫ۤ;->᩹:I

    .line 74
    iput v9, p0, Ll/۠۫ۤ;->᩵:I

    sub-int v1, v7, v2

    .line 75
    div-int/lit8 v1, v1, 0x4

    .line 79
    :cond_5
    iput v1, p0, Ll/۠۫ۤ;->᩻:I

    .line 80
    iput v7, p0, Ll/۠۫ۤ;->ܽ:I

    .line 82
    iget v5, p0, Ll/۠۫ۤ;->᩹:I

    if-nez v5, :cond_6

    .line 83
    iput v9, p0, Ll/۠۫ۤ;->᩵:I

    :cond_6
    const/high16 v8, 0x1000000

    if-gt v1, v8, :cond_a

    if-le v5, v1, :cond_7

    .line 90
    iput v1, p0, Ll/۠۫ۤ;->᩹:I

    .line 93
    :cond_7
    iget v5, p0, Ll/۠۫ۤ;->᩸:I

    add-int/2addr v2, v5

    iput v2, p0, Ll/۠۫ۤ;->֫:I

    .line 94
    iget v2, p0, Ll/۠۫ۤ;->᩵:I

    invoke-virtual {v0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v8

    invoke-static {v5, v7, v2, v3, v8}, Ll/ۙᩴۤ;->ۙ(IIIII)I

    move-result v2

    iput v2, p0, Ll/۠۫ۤ;->ۚ:I

    .line 95
    iget v2, p0, Ll/۠۫ۤ;->᩸:I

    int-to-long v7, v2

    int-to-long v10, v3

    add-long/2addr v7, v10

    invoke-virtual {v0}, Ll/᩶ۚۤ;->ۙ()I

    move-result v0

    int-to-long v10, v0

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v0, v7

    iput v0, p0, Ll/۠۫ۤ;->ۗ:I

    .line 97
    invoke-virtual {p1}, Ll/ܺۚۤ;->᩷()I

    move-result v0

    iput v0, p0, Ll/۠۫ۤ;->ܶ:I

    mul-int/lit8 v0, v1, 0x4

    .line 98
    invoke-virtual {p1, v0}, Ll/ܺۚۤ;->᩸(I)V

    .line 100
    iget v0, p0, Ll/۠۫ۤ;->᩹:I

    if-eqz v0, :cond_8

    .line 101
    invoke-virtual {p1, v0}, Ll/ܺۚۤ;->ۙ(I)[I

    move-result-object v0

    iput-object v0, p0, Ll/۠۫ۤ;->ۨ:[I

    goto :goto_0

    :cond_8
    new-array v0, v9, [I

    .line 103
    iput-object v0, p0, Ll/۠۫ۤ;->ۨ:[I

    .line 105
    :goto_0
    new-array v0, v1, [Ll/ۖ۫ۤ;

    iput-object v0, p0, Ll/۠۫ۤ;->ܺ:[Ll/ۖ۫ۤ;

    and-int/lit16 v0, v6, 0x100

    if-eqz v0, :cond_9

    goto :goto_1

    :cond_9
    const/4 v4, 0x0

    .line 106
    :goto_1
    iput-boolean v4, p0, Ll/۠۫ۤ;->ۧ:Z

    .line 108
    iget v0, p0, Ll/۠۫ۤ;->᩸:I

    add-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ll/ܺۚۤ;->ۤ(I)V

    return-void

    .line 86
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Too many strings"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(Ll/᩵ۚۤ;)Ll/۠۫ۤ;
    .locals 4

    .line 41
    new-instance v0, Ll/ۗۚۤ;

    iget-object v1, p0, Ll/᩵ۚۤ;->ܰ:[B

    invoke-direct {v0, v1}, Ll/ۗۚۤ;-><init>([B)V

    invoke-virtual {p0}, Ll/᩵ۚۤ;->ۙ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩶ۚۤ;->۫(I)Ll/ܺۚۤ;

    move-result-object v0

    .line 42
    new-instance v1, Ll/۠۫ۤ;

    invoke-direct {v1, v0}, Ll/۠۫ۤ;-><init>(Ll/ܺۚۤ;)V

    .line 43
    invoke-virtual {v0}, Ll/ܺۚۤ;->᩷()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Ll/᩵ۚۤ;->seek(J)V

    return-object v1
.end method

.method private ܳ(I)[I
    .locals 8

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    .line 223
    iget v1, p0, Ll/۠۫ۤ;->᩹:I

    if-ge p1, v1, :cond_4

    iget v1, p0, Ll/۠۫ۤ;->᩵:I

    if-lez v1, :cond_4

    iget v2, p0, Ll/۠۫ۤ;->ܽ:I

    if-ge v1, v2, :cond_0

    goto :goto_1

    .line 225
    :cond_0
    iget v2, p0, Ll/۠۫ۤ;->᩸:I

    int-to-long v2, v2

    int-to-long v4, v1

    add-long/2addr v2, v4

    .line 226
    iget-object v1, p0, Ll/۠۫ۤ;->ۨ:[I

    aget p1, v1, p1

    int-to-long v4, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    add-long/2addr v4, v2

    .line 227
    iget p1, p0, Ll/۠۫ۤ;->֫:I

    int-to-long v6, p1

    cmp-long p1, v2, v6

    if-ltz p1, :cond_4

    iget p1, p0, Ll/۠۫ۤ;->ۗ:I

    int-to-long v1, p1

    const-wide/16 v6, 0x4

    sub-long/2addr v1, v6

    cmp-long v3, v4, v1

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    long-to-int v1, v4

    .line 230
    new-instance v2, Ll/ܰܿ᩹;

    invoke-direct {v2}, Ll/ܰܿ᩹;-><init>()V

    :goto_0
    add-int/lit8 v3, p1, -0x4

    if-gt v1, v3, :cond_4

    .line 232
    iget-object v3, p0, Ll/۠۫ۤ;->ᩴ:Ll/᩶ۚۤ;

    invoke-virtual {v3, v1}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v4

    add-int/lit8 v5, v1, 0x4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_2

    .line 236
    invoke-virtual {v2}, Ll/ܳ᩺᩹;->ۘ()[I

    move-result-object p1

    return-object p1

    :cond_2
    add-int/lit8 v6, p1, -0x8

    if-le v5, v6, :cond_3

    return-object v0

    .line 240
    :cond_3
    invoke-virtual {v2, v4}, Ll/ܰܿ᩹;->add(I)Z

    .line 241
    invoke-virtual {v3, v5}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v4

    invoke-virtual {v2, v4}, Ll/ܰܿ᩹;->add(I)Z

    add-int/lit8 v4, v1, 0x8

    .line 242
    invoke-virtual {v3, v4}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܰܿ᩹;->add(I)Z

    add-int/lit8 v1, v1, 0xc

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method private ᩴ(I)Ljava/lang/String;
    .locals 5

    if-ltz p1, :cond_8

    .line 158
    iget v0, p0, Ll/۠۫ۤ;->᩻:I

    if-lt p1, v0, :cond_0

    goto/16 :goto_2

    .line 162
    :cond_0
    iget-object v0, p0, Ll/۠۫ۤ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 164
    :try_start_0
    iget v1, p0, Ll/۠۫ۤ;->᩸:I

    iget v2, p0, Ll/۠۫ۤ;->ܽ:I

    add-int/2addr v1, v2

    .line 208
    iget-object v2, p0, Ll/۠۫ۤ;->۫:Ll/ܳܰ᩹;

    if-eqz v2, :cond_1

    const/high16 v3, -0x80000000

    .line 211
    invoke-virtual {v2, p1, v3}, Ll/ܳܰ᩹;->ۤ(II)I

    move-result v2

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 214
    :cond_1
    iget-object v2, p0, Ll/۠۫ۤ;->ᩴ:Ll/᩶ۚۤ;

    iget v3, p0, Ll/۠۫ۤ;->ܶ:I

    mul-int/lit8 v4, p1, 0x4

    add-int/2addr v4, v3

    invoke-virtual {v2, v4}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    .line 165
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 166
    iget v0, p0, Ll/۠۫ۤ;->֫:I

    if-lt v1, v0, :cond_7

    iget v0, p0, Ll/۠۫ۤ;->ۚ:I

    if-lt v1, v0, :cond_2

    goto :goto_1

    .line 169
    :cond_2
    iget-object v2, p0, Ll/۠۫ۤ;->ᩴ:Ll/᩶ۚۤ;

    iget-boolean v3, p0, Ll/۠۫ۤ;->ۧ:Z

    invoke-virtual {p0, v2, v1, v3, v0}, Ll/ۙᩴۤ;->ۙ(Ll/᩶ۚۤ;IZI)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    .line 173
    iget-object v0, p0, Ll/۠۫ۤ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 174
    :try_start_1
    invoke-direct {p0, p1}, Ll/۠۫ۤ;->᩸(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    .line 176
    iget-object v1, p0, Ll/۠۫ۤ;->ᩴ:Ll/᩶ۚۤ;

    iget-boolean v3, p0, Ll/۠۫ۤ;->ۧ:Z

    iget v4, p0, Ll/۠۫ۤ;->ۚ:I

    invoke-virtual {p0, v1, v2, v3, v4}, Ll/ۙᩴۤ;->ۙ(Ll/᩶ۚۤ;IZI)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 179
    iget v3, p0, Ll/۠۫ۤ;->᩸:I

    sub-int/2addr v2, v3

    iget v3, p0, Ll/۠۫ۤ;->ܽ:I

    sub-int/2addr v2, v3

    .line 218
    iget-object v3, p0, Ll/۠۫ۤ;->۫:Ll/ܳܰ᩹;

    if-nez v3, :cond_3

    new-instance v3, Ll/ܳܰ᩹;

    invoke-direct {v3}, Ll/ܳܰ᩹;-><init>()V

    iput-object v3, p0, Ll/۠۫ۤ;->۫:Ll/ܳܰ᩹;

    .line 219
    :cond_3
    iget-object v3, p0, Ll/۠۫ۤ;->۫:Ll/ܳܰ᩹;

    invoke-virtual {v3, p1, v2}, Ll/ܳܰ᩹;->ۙ(II)I

    .line 182
    :cond_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_5

    const-string p1, ""

    return-object p1

    :cond_5
    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_6
    return-object v1

    :cond_7
    :goto_1
    const-string p1, ""

    return-object p1

    :catchall_1
    move-exception p1

    .line 165
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    .line 159
    :cond_8
    :goto_2
    iget v0, p0, Ll/۠۫ۤ;->᩻:I

    .line 47
    invoke-static {p1, v0}, Ll/ۨۤۤ;->ۙ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private ᩸(I)I
    .locals 6

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getPreviousStringEndOffset "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۤۤ;->ۙ(Ljava/lang/String;)V

    .line 192
    iget v0, p0, Ll/۠۫ۤ;->ܽ:I

    iget v1, p0, Ll/۠۫ۤ;->᩸:I

    add-int/2addr v1, v0

    if-nez p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 208
    iget-object v0, p0, Ll/۠۫ۤ;->۫:Ll/ܳܰ᩹;

    .line 209
    iget-object v2, p0, Ll/۠۫ۤ;->ᩴ:Ll/᩶ۚۤ;

    if-eqz v0, :cond_1

    const/high16 v3, -0x80000000

    .line 211
    invoke-virtual {v0, p1, v3}, Ll/ܳܰ᩹;->ۤ(II)I

    move-result v0

    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    mul-int/lit8 v0, p1, 0x4

    .line 214
    iget v3, p0, Ll/۠۫ۤ;->ܶ:I

    add-int/2addr v0, v3

    invoke-virtual {v2, v0}, Ll/᩶ۚۤ;->ۤ(I)I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    .line 196
    iget-boolean v0, p0, Ll/۠۫ۤ;->ۧ:Z

    iget v3, p0, Ll/۠۫ۤ;->ۚ:I

    invoke-static {v2, v1, v0, v3}, Ll/ۙᩴۤ;->᩷(Ll/᩶ۚۤ;IZI)I

    move-result v1

    .line 197
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "new offset "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۨۤۤ;->ۙ(Ljava/lang/String;)V

    const/4 v4, -0x1

    if-eq v1, v4, :cond_2

    return v1

    .line 201
    :cond_2
    invoke-direct {p0, p1}, Ll/۠۫ۤ;->᩸(I)I

    move-result p1

    if-ne p1, v4, :cond_3

    return v4

    .line 204
    :cond_3
    invoke-static {v2, p1, v0, v3}, Ll/ۙᩴۤ;->᩷(Ll/᩶ۚۤ;IZI)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final getItem(I)Ll/ۖ۫ۤ;
    .locals 4

    if-ltz p1, :cond_3

    .line 124
    iget v0, p0, Ll/۠۫ۤ;->᩻:I

    if-ge p1, v0, :cond_3

    .line 125
    iget-object v0, p0, Ll/۠۫ۤ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    .line 126
    :try_start_0
    iget-object v1, p0, Ll/۠۫ۤ;->ܺ:[Ll/ۖ۫ۤ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    aget-object v1, v1, p1

    :goto_0
    if-eqz v1, :cond_1

    .line 128
    monitor-exit v0

    return-object v1

    .line 129
    :cond_1
    invoke-direct {p0, p1}, Ll/۠۫ۤ;->ᩴ(I)Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-direct {p0, p1}, Ll/۠۫ۤ;->ܳ(I)[I

    move-result-object v2

    .line 131
    new-instance v3, Ll/ۖ۫ۤ;

    invoke-direct {v3, p0, v1, v2}, Ll/ۖ۫ۤ;-><init>(Ll/ۙᩴۤ;Ljava/lang/String;[I)V

    .line 132
    iget-object v1, p0, Ll/۠۫ۤ;->ܺ:[Ll/ۖ۫ۤ;

    if-eqz v1, :cond_2

    .line 133
    aput-object v3, v1, p1

    .line 135
    :cond_2
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p1

    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 138
    :cond_3
    invoke-direct {p0, p1}, Ll/۠۫ۤ;->ᩴ(I)Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-direct {p0, p1}, Ll/۠۫ۤ;->ܳ(I)[I

    move-result-object p1

    .line 140
    new-instance v1, Ll/ۖ۫ۤ;

    invoke-direct {v1, p0, v0, p1}, Ll/ۖ۫ۤ;-><init>(Ll/ۙᩴۤ;Ljava/lang/String;[I)V

    return-object v1
.end method

.method public final bridge synthetic getItem(I)Ll/ܶ۫ۤ;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ll/۠۫ۤ;->getItem(I)Ll/ۖ۫ۤ;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 113
    iget v0, p0, Ll/۠۫ۤ;->᩻:I

    return v0
.end method

.method public final ۙ(I)Ll/ܶ۫ۤ;
    .locals 1

    .line 146
    iget v0, p0, Ll/۠۫ۤ;->᩻:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 149
    invoke-virtual {p0, p1}, Ll/۠۫ۤ;->getItem(I)Ll/ۖ۫ۤ;

    move-result-object p1

    return-object p1

    .line 147
    :cond_0
    invoke-static {p1, v0}, Ll/ۨۤۤ;->ۙ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    throw p1
.end method

.method public final ۙ()Z
    .locals 1

    .line 154
    iget-boolean v0, p0, Ll/۠۫ۤ;->ۧ:Z

    return v0
.end method

.method public final ᩸()V
    .locals 2

    .line 117
    iget-object v0, p0, Ll/۠۫ۤ;->ܳ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 118
    :try_start_0
    iput-object v1, p0, Ll/۠۫ۤ;->ܺ:[Ll/ۖ۫ۤ;

    .line 119
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
