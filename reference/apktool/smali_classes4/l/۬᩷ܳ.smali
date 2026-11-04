.class public final Ll/۬᩷ܳ;
.super Ljava/lang/Object;
.source "ZIPT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public volatile ֡:Z

.field public final ֨:J

.field public final ۖ:I

.field public final ۜ:Ll/۟ܳܳ;

.field public final ۟:J

.field public final ۠:J

.field public final ۡ:I

.field public final ۢ:J

.field public final ܰ:I

.field public final ܿ:Ll/۬ۙܳ;

.field public final ᩳ:Ll/۟ܳܳ;

.field public final ᩶:I


# direct methods
.method public constructor <init>(Ll/۬ۙܳ;JJLl/۟ܳܳ;Ll/۟ܳܳ;)V
    .locals 2

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Ll/۬᩷ܳ;->ܿ:Ll/۬ۙܳ;

    iput-wide p2, p0, Ll/۬᩷ܳ;->ۢ:J

    iput-wide p4, p0, Ll/۬᩷ܳ;->۟:J

    iput-object p6, p0, Ll/۬᩷ܳ;->ᩳ:Ll/۟ܳܳ;

    iput-object p7, p0, Ll/۬᩷ܳ;->ۜ:Ll/۟ܳܳ;

    .line 171
    invoke-virtual {p6}, Ll/۟ܳܳ;->ۙ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬᩷ܳ;->֨:J

    invoke-virtual {p7}, Ll/۟ܳܳ;->ۙ()J

    move-result-wide p6

    iput-wide p6, p0, Ll/۬᩷ܳ;->۠:J

    .line 172
    iget-object p6, p1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 p7, 0x1

    invoke-virtual {p6, p2, p3, p7}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result p6

    iput p6, p0, Ll/۬᩷ܳ;->ܰ:I

    iget-object p1, p1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result p2

    iput p2, p0, Ll/۬᩷ܳ;->᩶:I

    .line 173
    invoke-virtual {p1, p4, p5, p7}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result p3

    sub-int/2addr p3, p6

    iput p3, p0, Ll/۬᩷ܳ;->ۖ:I

    invoke-virtual {p1, p4, p5, v0}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result p1

    sub-int/2addr p1, p2

    iput p1, p0, Ll/۬᩷ܳ;->ۡ:I

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/۬᩷ܳ;)Ll/۟ܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬᩷ܳ;->ᩳ:Ll/۟ܳܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/۬᩷ܳ;)Ll/۟ܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬᩷ܳ;->ۜ:Ll/۟ܳܳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/۬᩷ܳ;->ᩳ:Ll/۟ܳܳ;

    invoke-virtual {v0}, Ll/۟ܳܳ;->close()V

    iget-object v0, p0, Ll/۬᩷ܳ;->ۜ:Ll/۟ܳܳ;

    invoke-virtual {v0}, Ll/۟ܳܳ;->close()V

    return-void
.end method

.method public final ۙ()Ll/۬ۙܳ;
    .locals 6

    .line 177
    new-instance v0, Ll/ۡ᩷ܳ;

    invoke-direct {v0, p0}, Ll/ۡ᩷ܳ;-><init>(Ll/۬᩷ܳ;)V

    .line 178
    iget-boolean v1, p0, Ll/۬᩷ܳ;->֡:Z

    if-nez v1, :cond_0

    .line 179
    iget-object v1, p0, Ll/۬᩷ܳ;->ᩳ:Ll/۟ܳܳ;

    iget v2, p0, Ll/۬᩷ܳ;->ܰ:I

    iget v3, p0, Ll/۬᩷ܳ;->ۖ:I

    new-instance v4, Ll/ۖ᩷ܳ;

    invoke-direct {v4, p0}, Ll/ۖ᩷ܳ;-><init>(Ll/۬᩷ܳ;)V

    invoke-virtual {v1, v2, v3, v4}, Ll/۟ܳܳ;->ۙ(IILl/۟֡֫;)Ll/ۜܳܳ;

    move-result-object v1

    .line 180
    :try_start_0
    iget-object v2, p0, Ll/۬᩷ܳ;->ۜ:Ll/۟ܳܳ;

    iget v3, p0, Ll/۬᩷ܳ;->᩶:I

    iget v4, p0, Ll/۬᩷ܳ;->ۡ:I

    new-instance v5, Ll/۠᩷ܳ;

    invoke-direct {v5, p0}, Ll/۠᩷ܳ;-><init>(Ll/۬᩷ܳ;)V

    invoke-virtual {v2, v3, v4, v5}, Ll/۟ܳܳ;->ۙ(IILl/۟֡֫;)Ll/ۜܳܳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 187
    :try_start_1
    new-instance v3, Ll/ۜ᩷ܳ;

    invoke-direct {v3, v1}, Ll/ۜ᩷ܳ;-><init>(Ll/ۜܳܳ;)V

    new-instance v4, Ll/ۜ᩷ܳ;

    invoke-direct {v4, v2}, Ll/ۜ᩷ܳ;-><init>(Ll/ۜܳܳ;)V

    .line 182
    invoke-static {v3, v4, v0}, Ll/۬ۙܳ;->ۙ(Ll/᩸۫ܳ;Ll/᩸۫ܳ;Ljava/util/function/BooleanSupplier;)Ll/۬ۙܳ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    :try_start_2
    invoke-virtual {v2}, Ll/ۜܳܳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1}, Ll/ۜܳܳ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 179
    :try_start_3
    invoke-virtual {v2}, Ll/ۜܳܳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Ll/ۜܳܳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0

    .line 178
    :cond_0
    new-instance v0, Ll/ۡܳܳ;

    invoke-direct {v0}, Ll/ۡܳܳ;-><init>()V

    throw v0
.end method
