.class public final Ll/᩺᩹ۧ;
.super Ljava/lang/Object;
.source "KAQ1"


# instance fields
.field public final ۙ:Ll/ۛ᩹ۧ;

.field public final ۤ:Ll/ܽ֫ۗ;

.field public final ᩷:Ll/᩵ۗۧ;

.field public final ᩸:Ll/ۛ᩹ܳ;


# direct methods
.method public constructor <init>(Ll/᩵ۗۧ;)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ll/ܽ֫ۗ;

    invoke-direct {v0}, Ll/ܽ֫ۗ;-><init>()V

    iput-object v0, p0, Ll/᩺᩹ۧ;->ۤ:Ll/ܽ֫ۗ;

    .line 52
    new-instance v0, Ll/ۛ᩹ۧ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۛ᩹ۧ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/᩺᩹ۧ;->ۙ:Ll/ۛ᩹ۧ;

    .line 55
    iput-object p1, p0, Ll/᩺᩹ۧ;->᩷:Ll/᩵ۗۧ;

    .line 57
    :try_start_0
    invoke-static {}, Ll/ۛ᩹ܳ;->᩷()Ll/ۛ᩹ܳ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩹ۧ;->᩸:Ll/ۛ᩹ܳ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot load platform class set"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۙ(Ll/᩺᩹ۧ;Ljava/lang/String;)Ll/ۘ᩹ۧ;
    .locals 2

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v0, p1}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    iget-object v1, p0, Ll/᩺᩹ۧ;->᩷:Ll/᩵ۗۧ;

    invoke-virtual {v1, v0}, Ll/᩵ۗۧ;->᩸(Ljava/lang/String;)Ll/ܰ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 74
    check-cast v0, Ll/ۗۗۧ;

    invoke-virtual {v0}, Ll/ۗۗۧ;->ᩴ()Ll/᩸ۤۛ;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    new-instance p1, Ll/ۘ᩹ۧ;

    invoke-direct {p1, p0}, Ll/ۘ᩹ۧ;-><init>(Ll/ۢ۫ۛ;)V

    return-object p1

    .line 81
    :cond_1
    :try_start_0
    iget-object p0, p0, Ll/᩺᩹ۧ;->᩸:Ll/ۛ᩹ܳ;

    invoke-virtual {p0, p1}, Ll/ۛ᩹ܳ;->ۙ(Ljava/lang/String;)Ll/ۗ᩹ܳ;

    move-result-object p0

    if-nez p0, :cond_2

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 82
    :cond_2
    new-instance v0, Ll/ۘ᩹ۧ;

    invoke-direct {v0, p0}, Ll/ۘ᩹ۧ;-><init>(Ll/ۗ᩹ܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read platform class: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Ll/ۘ᩹ۧ;
    .locals 2

    .line 64
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 67
    :cond_0
    iget-object v0, p0, Ll/᩺᩹ۧ;->ۤ:Ll/ܽ֫ۗ;

    iget-object v1, p0, Ll/᩺᩹ۧ;->ۙ:Ll/ۛ᩹ۧ;

    invoke-static {v0, p1, v1}, Ll/᩹֫ۗ;->computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩹ۧ;

    return-object p1
.end method
