.class public abstract Ll/ܺ֨ۗ;
.super Ll/֡֨ۗ;
.source "I6H4"


# static fields
.field public static final synthetic ۟:I

.field public static final ᩳ:Ll/᩻ܽ᩺;


# instance fields
.field public ֡:Ll/ᩳۡۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Ll/ܺ֨ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ܺ֨ۗ;->ᩳ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    return-void
.end method

.method public static ۙ(ILl/֫֨ۗ;Z)Ll/ۛ֨ۗ;
    .locals 1

    .line 54
    new-instance v0, Ll/ۛ֨ۗ;

    invoke-direct {v0, p0, p1}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    if-eqz p2, :cond_0

    .line 56
    sget-object p0, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ll/ۜ᩶ۗ;ILl/֫֨ۗ;)Ll/ۛ֨ۗ;
    .locals 0

    .line 35
    invoke-interface {p0, p1}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    .line 31
    new-instance p1, Ll/ۛ֨ۗ;

    invoke-direct {p1, p0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    return-object p1
.end method

.method public static ۤ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;
    .locals 2

    .line 165
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    .line 166
    sget-object v1, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    invoke-static {p0}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object p0

    return-object p0

    .line 167
    :cond_1
    :goto_0
    sget-object v0, Ll/֫۟ۗ;->ۗۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 168
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    .line 70
    sget-object v1, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 71
    new-instance v1, Ll/ܽ֨ۗ;

    invoke-direct {v1, p0}, Ll/ܽ֨ۗ;-><init>(Ll/ᩳۡۗ;)V

    if-eqz v0, :cond_2

    .line 171
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object p0

    .line 14
    iput-object p0, v1, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    :cond_2
    return-object v1

    :cond_3
    const/4 v0, 0x0

    .line 175
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 176
    sget-object v1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return-object v0
.end method

.method public static ᩷(Ll/ۜ᩶ۗ;ILl/֫֨ۗ;)Ll/ۛ֨ۗ;
    .locals 1

    .line 39
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩶()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-interface {p0, p1}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    const/4 p1, 0x1

    .line 50
    invoke-static {p0, p2, p1}, Ll/ܺ֨ۗ;->ۙ(ILl/֫֨ۗ;Z)Ll/ۛ֨ۗ;

    move-result-object p0

    return-object p0

    .line 42
    :cond_0
    invoke-interface {p0, p1}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    .line 31
    new-instance p1, Ll/ۛ֨ۗ;

    invoke-direct {p1, p0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    return-object p1
.end method

.method public static ᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;
    .locals 4

    .line 189
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    .line 70
    sget-object v1, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 71
    new-instance v1, Ll/ܽ֨ۗ;

    invoke-direct {v1, p0}, Ll/ܽ֨ۗ;-><init>(Ll/ᩳۡۗ;)V

    .line 191
    sget-object v2, Ll/᩻֨ۗ;->ۙ:[I

    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 p0, 0x3

    if-eq v2, p0, :cond_1

    const/4 p0, 0x4

    if-eq v2, p0, :cond_0

    if-eqz v0, :cond_2

    .line 211
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object p0

    .line 14
    iput-object p0, v1, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-object v1

    .line 203
    :cond_0
    sget-object p0, Ll/֫֨ۗ;->ܳ:Ll/֫֨ۗ;

    .line 14
    iput-object p0, v1, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    if-eqz v0, :cond_2

    .line 205
    invoke-virtual {v0, p0}, Ll/ۛ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    return-object v1

    .line 197
    :cond_1
    sget-object p0, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    .line 14
    iput-object p0, v1, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    if-eqz v0, :cond_2

    .line 199
    invoke-virtual {v0, p0}, Ll/ۛ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    :cond_2
    return-object v1

    .line 194
    :cond_3
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Don\'t wrap MOVE or CONST insns: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 194
    throw v0
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܺ֨ۗ;
    .locals 7

    .line 106
    iget-object v0, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-ne v0, p2, :cond_1

    .line 111
    sget-object p1, Ll/ܺ֨ۗ;->ᩳ:Ll/᩻ܽ᩺;

    const-string p3, "Can\'t wrap instruction info itself: {}"

    invoke-interface {p1, p2, p3}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 154
    :cond_1
    invoke-virtual {v0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v2, :cond_3

    .line 156
    invoke-virtual {v0, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    if-ne v6, p0, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, -0x1

    :goto_1
    if-ne v4, v5, :cond_4

    :goto_2
    return-object v1

    .line 118
    :cond_4
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_6

    .line 0
    instance-of v1, p0, Ll/ۛ֨ۗ;

    if-eqz v1, :cond_6

    .line 120
    move-object v1, p0

    check-cast v1, Ll/ۛ֨ۗ;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 122
    invoke-virtual {p2, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v3, v2, Ll/ۛ֨ۗ;

    if-eqz v3, :cond_5

    .line 124
    check-cast v2, Ll/ۛ֨ۗ;

    .line 116
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    .line 117
    :goto_3
    invoke-virtual {v2, v1}, Ll/ۛ֨ۗ;->setName(Ljava/lang/String;)V

    goto :goto_4

    .line 0
    :cond_5
    instance-of v3, v2, Ll/ܽ֨ۗ;

    if-eqz v3, :cond_6

    .line 126
    check-cast v2, Ll/ܽ֨ۗ;

    invoke-virtual {v2}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v2

    .line 127
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 116
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    goto :goto_3

    .line 134
    :cond_6
    :goto_4
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 135
    invoke-static {p2}, Ll/ܺ֨ۗ;->ۤ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v2

    .line 136
    invoke-virtual {v0, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 137
    invoke-virtual {v2}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    sget-object v6, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    if-ne v5, v6, :cond_7

    .line 139
    invoke-virtual {v3}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/֡֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    .line 141
    :cond_7
    invoke-virtual {v0, v4, v2}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    .line 142
    invoke-static {p1, v3}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    if-eqz p3, :cond_8

    .line 144
    invoke-static {p1, p0}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    :cond_8
    if-eqz v1, :cond_9

    .line 146
    sget-object p3, Ll/֫۟ۗ;->ۗۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, p3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p3

    if-nez p3, :cond_9

    .line 148
    invoke-static {p1, p2}, Ll/ۢ֫᩵;->᩸(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    :cond_9
    return-object v2
.end method

.method public ۙ(Ll/ᩳۡۗ;)V
    .locals 0

    .line 96
    iput-object p1, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    return-void
.end method

.method public final ۙ(Ll/ۛ֨ۗ;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 0
    :cond_0
    instance-of v1, p0, Ll/ۛ֨ۗ;

    if-eqz v1, :cond_1

    .line 292
    move-object v0, p0

    check-cast v0, Ll/ۛ֨ۗ;

    invoke-virtual {v0, p1}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public final ۙۙ()Z
    .locals 4

    .line 259
    sget-object v0, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 0
    :cond_0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_1

    .line 271
    move-object v0, p0

    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 263
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->ۚۙ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_2

    .line 264
    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ֨ۗ;->ۙۙ()Z

    move-result v0

    return v0

    :cond_2
    return v1
.end method

.method public ۚۙ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ll/ᩳۡۗ;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public abstract ۠()Ll/ܺ֨ۗ;
.end method

.method public final ۤۙ()Z
    .locals 6

    .line 0
    instance-of v0, p0, Ll/᩹֨ۗ;

    if-eqz v0, :cond_0

    .line 237
    move-object v0, p0

    check-cast v0, Ll/᩹֨ۗ;

    .line 238
    invoke-virtual {v0}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 10
    iget-object v0, v0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 238
    sget-object v1, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫ۙ()Z
    .locals 4

    .line 223
    invoke-virtual {p0}, Ll/ܺ֨ۗ;->ۚۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 0
    :cond_0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 227
    move-object v0, p0

    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    .line 228
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_1

    .line 229
    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ֨ۗ;->ۚۙ()Z

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public final ᩴۙ()Z
    .locals 6

    .line 0
    instance-of v0, p0, Ll/᩹֨ۗ;

    if-eqz v0, :cond_0

    .line 245
    move-object v0, p0

    check-cast v0, Ll/᩹֨ۗ;

    .line 246
    invoke-virtual {v0}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 10
    iget-object v0, v0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 246
    sget-object v1, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷ۙ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/᩹֨ۗ;

    if-nez v0, :cond_1

    instance-of v0, p0, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_0

    .line 277
    move-object v0, p0

    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
