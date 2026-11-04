.class public final Ll/ᩴ۫ۚ;
.super Ljava/lang/Object;
.source "P6C7"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:Ll/᩷ܿۚ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩷ܿۚ;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p2, p0, Ll/ᩴ۫ۚ;->᩷:Ll/᩷ܿۚ;

    .line 16
    invoke-virtual {p2}, Ll/᩷ܿۚ;->ۙ()Ll/ۡۘۚ;

    move-result-object p2

    const-string v0, "path"

    invoke-static {p1, p2, v0}, Ll/᩷ܿۚ;->ۙ(Ljava/lang/String;Ll/ۡۘۚ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ۫ۚ;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 21
    iget-object v0, p0, Ll/ᩴ۫ۚ;->᩷:Ll/᩷ܿۚ;

    invoke-virtual {v0}, Ll/᩷ܿۚ;->ۙ()Ll/ۡۘۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ᩴ۫ۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۡۘۚ;->ۤ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩷()Ll/᩷ۨᩴ;
    .locals 6

    .line 26
    iget-object v0, p0, Ll/ᩴ۫ۚ;->᩷:Ll/᩷ܿۚ;

    iget-object v1, p0, Ll/ᩴ۫ۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩷ܿۚ;->ۙ(Ljava/lang/String;)Ll/ᩳܿۚ;

    move-result-object v2

    .line 27
    :try_start_0
    invoke-virtual {p0}, Ll/ᩴ۫ۚ;->ۙ()V

    .line 28
    invoke-virtual {v0, v1}, Ll/᩷ܿۚ;->ۤ(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v3

    .line 29
    invoke-virtual {v0, v3}, Ll/᩷ܿۚ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 30
    invoke-virtual {v0, v1}, Ll/᩷ܿۚ;->᩸(Ljava/lang/String;)Ll/֫ۨᩴ;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v4

    sget-object v5, Ll/۫ۨᩴ;->֡:Ll/۫ۨᩴ;

    if-eq v4, v5, :cond_1

    .line 32
    invoke-virtual {v0}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v4

    sget-object v5, Ll/۫ۨᩴ;->ᩳ:Ll/۫ۨᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v4, v5, :cond_0

    .line 36
    invoke-virtual {v2}, Ll/ᩳܿۚ;->close()V

    return-object v3

    :cond_0
    :try_start_1
    const-string v3, "FILE_NOT_REGULAR"

    const-string v4, "Installation requires a regular APK file."

    .line 33
    invoke-virtual {v0}, Ll/֫ۨᩴ;->ᩴ()Ll/۫ۨᩴ;

    move-result-object v0

    invoke-static {v3, v4, v1, v0}, Ll/᩷ܿۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/۫ۨᩴ;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    .line 31
    :cond_1
    invoke-static {v1}, Ll/᩷ܿۚ;->ᩴ(Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 26
    :try_start_2
    invoke-virtual {v2}, Ll/ᩳܿۚ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method
