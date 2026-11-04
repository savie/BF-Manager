.class public Ll/۫᩶ܳ;
.super Ljava/lang/Object;
.source "62A7"

# interfaces
.implements Ll/ۖۗܳ;


# static fields
.field public static final ۙۙ:Ll/ۖۗܳ;


# instance fields
.field public ֡:Ll/ۨ֡֫;

.field public ֨:Z

.field public ۖ:Ljava/lang/String;

.field public ۜ:Ll/᩷᩶᩹;

.field public ۟:I

.field public ۠:J

.field public ۡ:Ljava/lang/String;

.field public ۢ:Ljava/lang/String;

.field public ۬:J

.field public ܰ:J

.field public volatile ܿ:Ll/᩷ۡ;

.field public ᩳ:Z

.field public ᩶:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 21
    new-instance v9, Ll/ܳ᩶ܳ;

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-string v1, ".."

    const-string v2, ""

    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ll/۫᩶ܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    sput-object v9, Ll/۫᩶ܳ;->ۙۙ:Ll/ۖۗܳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 31
    iput-wide v0, p0, Ll/۫᩶ܳ;->ܰ:J

    const-string v0, "/"

    if-eqz p2, :cond_3

    .line 44
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 48
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 49
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, p2

    .line 52
    :cond_3
    :goto_0
    iput-object p1, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    .line 53
    iput-object v0, p0, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    .line 55
    iput-wide p4, p0, Ll/۫᩶ܳ;->۠:J

    .line 56
    iput-wide p6, p0, Ll/۫᩶ܳ;->۬:J

    .line 57
    iput-boolean p8, p0, Ll/۫᩶ܳ;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0}, Ll/۫᩶ܳ;->clone()Ll/ۖۗܳ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۖۗܳ;
    .locals 2

    .line 274
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۗܳ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 276
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_7

    .line 314
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 316
    :cond_1
    check-cast p1, Ll/۫᩶ܳ;

    .line 318
    iget-wide v1, p0, Ll/۫᩶ܳ;->۠:J

    iget-wide v3, p1, Ll/۫᩶ܳ;->۠:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    return v0

    .line 319
    :cond_2
    iget-wide v1, p0, Ll/۫᩶ܳ;->۬:J

    iget-wide v3, p1, Ll/۫᩶ܳ;->۬:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    return v0

    .line 320
    :cond_3
    iget-boolean v1, p0, Ll/۫᩶ܳ;->ᩳ:Z

    iget-boolean v2, p1, Ll/۫᩶ܳ;->ᩳ:Z

    if-eq v1, v2, :cond_4

    return v0

    .line 321
    :cond_4
    iget-object v1, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    iget-object v2, p1, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    .line 322
    :cond_5
    iget-object v1, p0, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    iget-object v2, p1, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v0

    .line 323
    :cond_6
    iget-object v0, p0, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    iget-object p1, p1, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    .line 50
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    :goto_0
    return v0
.end method

.method public final getIcon()Ll/ۨ֡֫;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/۫᩶ܳ;->֡:Ll/ۨ֡֫;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public final getParent()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 3

    .line 91
    iget-object v0, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v0, "/"

    .line 0
    invoke-static {v2, v0}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v2, v0}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSize()J
    .locals 2

    .line 138
    iget-wide v0, p0, Ll/۫᩶ܳ;->۠:J

    return-wide v0
.end method

.method public final getTime()J
    .locals 2

    .line 152
    iget-wide v0, p0, Ll/۫᩶ܳ;->۬:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    .line 328
    iget-object v0, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 329
    iget-object v2, p0, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۨۨ᩹;->ۙ(IILjava/lang/String;)I

    move-result v0

    .line 330
    iget-wide v1, p0, Ll/۫᩶ܳ;->۠:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 331
    iget-wide v1, p0, Ll/۫᩶ܳ;->۬:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 332
    iget-boolean v1, p0, Ll/۫᩶ܳ;->ᩳ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 333
    iget-object v1, p0, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isChecked()Z
    .locals 1

    .line 205
    iget-boolean v0, p0, Ll/۫᩶ܳ;->᩶:Z

    return v0
.end method

.method public final isDirectory()Z
    .locals 1

    .line 181
    invoke-virtual {p0}, Ll/۫᩶ܳ;->ܺ᩷()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/۫᩶ܳ;->ᩳ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setChecked(Z)V
    .locals 1

    .line 210
    invoke-virtual {p0}, Ll/۫᩶ܳ;->ܺ᩷()Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    iput-boolean p1, p0, Ll/۫᩶ܳ;->᩶:Z

    return-void

    .line 211
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final setTime(J)V
    .locals 0

    .line 156
    iput-wide p1, p0, Ll/۫᩶ܳ;->۬:J

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public ֡()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/᩻᩶ܳ;

    return v0
.end method

.method public final ֡ۙ()Z
    .locals 1

    .line 176
    invoke-virtual {p0}, Ll/۫᩶ܳ;->ܺ᩷()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/۫᩶ܳ;->ᩳ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֨᩷()Ll/۠᩺ᩴ;
    .locals 2

    .line 129
    iget-object v0, p0, Ll/۫᩶ܳ;->ܿ:Ll/᩷ۡ;

    if-eqz v0, :cond_0

    .line 131
    invoke-interface {v0}, Ll/᩷ۡ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠᩺ᩴ;

    return-object v0

    .line 62
    :cond_0
    iget-object v0, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    const/4 v1, 0x1

    .line 58
    invoke-static {v0, v1}, Ll/۠᩺ᩴ;->ۙ(Ljava/lang/String;Z)Ll/۠᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public ۗۙ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ܳ᩶ܳ;

    return v0
.end method

.method public ۘ᩷()Ll/᩷ۨᩴ;
    .locals 2

    .line 80
    invoke-virtual {p0}, Ll/۫᩶ܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(J)V
    .locals 0

    .line 142
    iput-wide p1, p0, Ll/۫᩶ܳ;->ܰ:J

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 200
    iput-object p1, p0, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Ll/ۨ֡֫;)V
    .locals 0

    .line 234
    iput-object p1, p0, Ll/۫᩶ܳ;->֡:Ll/ۨ֡֫;

    const/4 p1, 0x0

    .line 235
    iput p1, p0, Ll/۫᩶ܳ;->۟:I

    return-void
.end method

.method public final ۙ(Ll/᩵ܰܳ;)V
    .locals 0

    .line 245
    iget-object p1, p1, Ll/᩵ܰܳ;->ۤ:Ll/ۨ֡֫;

    .line 113
    invoke-virtual {p0, p1}, Ll/۫᩶ܳ;->ۙ(Ll/ۨ֡֫;)V

    return-void
.end method

.method public final ۙ(Ll/᩷ۡ;)V
    .locals 0

    .line 124
    iput-object p1, p0, Ll/۫᩶ܳ;->ܿ:Ll/᩷ۡ;

    return-void
.end method

.method public ۙ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۢ᩸۫;

    return v0
.end method

.method public final ۚ(I)Ljava/lang/Object;
    .locals 1

    .line 302
    iget-object v0, p0, Ll/۫᩶ܳ;->ۜ:Ll/᩷᩶᩹;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 303
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩷᩶᩹;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۛۙ()Ljava/lang/String;
    .locals 2

    .line 113
    iget-object v0, p0, Ll/۫᩶ܳ;->ܿ:Ll/᩷ۡ;

    if-eqz v0, :cond_0

    .line 115
    invoke-interface {v0}, Ll/᩷ۡ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠᩺ᩴ;

    invoke-virtual {v0}, Ll/۠᩺ᩴ;->۫()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 118
    :cond_0
    invoke-virtual {p0}, Ll/۫᩶ܳ;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩷ۨᩴ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۛ᩷()Ll/ۡۗܳ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۟ۙ()Ljava/lang/CharSequence;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 3

    .line 67
    iget-object v0, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x1f4

    if-gt v1, v2, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܰ()Ljava/lang/CharSequence;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ܰۙ()Z
    .locals 5

    .line 245
    invoke-virtual {p0}, Ll/۫᩶ܳ;->ܺ᩷()Z

    move-result v0

    if-nez v0, :cond_2

    .line 138
    iget-wide v0, p0, Ll/۫᩶ܳ;->۠:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 248
    :cond_0
    invoke-virtual {p0}, Ll/۫᩶ܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/۫᩶ܳ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܰ᩷()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Ll/۫᩶ܳ;->֨:Z

    return v0
.end method

.method public final ܳ᩷()J
    .locals 2

    .line 147
    iget-wide v0, p0, Ll/۫᩶ܳ;->ܰ:J

    return-wide v0
.end method

.method public final ܺۙ()Ljava/lang/String;
    .locals 3

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۫᩶ܳ;->ۖ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫᩶ܳ;->ۡ:Ljava/lang/String;

    const-string v2, "/"

    .line 0
    invoke-static {v0, v1, v2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ᩷()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ܳ᩶ܳ;

    if-nez v0, :cond_1

    .line 77
    invoke-interface {p0}, Ll/ۖۗܳ;->᩻᩷()Z

    move-result v0

    if-nez v0, :cond_1

    .line 0
    instance-of v0, p0, Ll/᩻᩶ܳ;

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

.method public final ᩳ()Z
    .locals 1

    .line 186
    iget-object v0, p0, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩶ۙ()I
    .locals 1

    .line 262
    iget v0, p0, Ll/۫᩶ܳ;->۟:I

    return v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 240
    iput p1, p0, Ll/۫᩶ܳ;->۟:I

    return-void
.end method

.method public final ᩷(ILjava/lang/Object;)V
    .locals 1

    .line 292
    iget-object v0, p0, Ll/۫᩶ܳ;->ۜ:Ll/᩷᩶᩹;

    if-nez v0, :cond_0

    .line 294
    new-instance v0, Ll/᩷᩶᩹;

    invoke-direct {v0}, Ll/᩷᩶᩹;-><init>()V

    iput-object v0, p0, Ll/۫᩶ܳ;->ۜ:Ll/᩷᩶᩹;

    .line 296
    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/᩷᩶᩹;->ۙ(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩷(Z)V
    .locals 1

    .line 222
    invoke-virtual {p0}, Ll/۫᩶ܳ;->ܺ᩷()Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    iput-boolean p1, p0, Ll/۫᩶ܳ;->֨:Z

    return-void

    .line 223
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ᩷ۙ()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Ll/۫᩶ܳ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩺ۙ()Ljava/lang/String;
    .locals 1

    .line 106
    invoke-virtual {p0}, Ll/۫᩶ܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/۫᩶ܳ;->᩻᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {p0}, Ll/۫᩶ܳ;->֨᩷()Ll/۠᩺ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠᩺ᩴ;->ܳ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const-string v0, "*/*"

    return-object v0
.end method

.method public ᩺᩷()I
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ܳ᩶ܳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 92
    :cond_0
    invoke-virtual {p0}, Ll/۫᩶ܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x5

    return v0

    .line 95
    :cond_1
    invoke-interface {p0}, Ll/ۖۗܳ;->᩻᩷()Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xa

    return v0

    :cond_2
    const/16 v0, 0xf

    return v0
.end method

.method public ᩻᩷()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
