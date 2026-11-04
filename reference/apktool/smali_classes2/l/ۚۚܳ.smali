.class public final Ll/ۚۚܳ;
.super Ljava/lang/Object;
.source "Q6J8"


# instance fields
.field public ۙ:Z

.field public ۤ:Z

.field public final ᩴ:Ll/᩷ۨᩴ;

.field public ᩷:Ljava/io/OutputStream;

.field public final ᩸:Ll/᩷ۨᩴ;


# direct methods
.method public constructor <init>(Ll/᩷ۨᩴ;Ljava/lang/String;)V
    .locals 4

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {p2}, Ll/ۚۚܳ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۡ()V

    .line 20
    invoke-virtual {p1, p2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۚܳ;->᩸:Ll/᩷ۨᩴ;

    const-string v0, ".mtdownload"

    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x64

    if-ge v0, v1, :cond_1

    const/4 v1, 0x1

    .line 1147
    invoke-virtual {p1, v1}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 34
    :try_start_0
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->᩶()Ll/ۧۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۧۨᩴ;->ۤ()V
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_1

    .line 21
    iput-object v1, p0, Ll/ۚۚܳ;->ᩴ:Ll/᩷ۨᩴ;

    .line 446
    :try_start_1
    invoke-virtual {v1, p2}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object p1

    .line 23
    iput-object p1, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p0}, Ll/ۚۚܳ;->ۙ()V

    .line 26
    throw p1

    :catch_1
    move-exception v1

    .line 37
    invoke-virtual {v1}, Ll/᩸ۨᩴ;->ۤ()Ll/ۤۨᩴ;

    move-result-object v2

    sget-object v3, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    throw v1

    .line 40
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unable to reserve download filename"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid download filename"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 4

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, ".."

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 81
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 82
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-lt v2, v3, :cond_2

    const/16 v3, 0x2f

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_2

    const/16 v3, 0x7f

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 68
    iget-object v0, p0, Ll/ۚۚܳ;->ᩴ:Ll/᩷ۨᩴ;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :cond_0
    iput-object v1, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;

    .line 71
    iget-boolean v1, p0, Ll/ۚۚܳ;->ۙ:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ۚۚܳ;->ۤ:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->᩶()Ll/ۧۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧۨᩴ;->ᩴ()V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    .line 70
    iput-object v1, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;

    .line 71
    iget-boolean v1, p0, Ll/ۚۚܳ;->ۙ:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/ۚۚܳ;->ۤ:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->᩶()Ll/ۧۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧۨᩴ;->ᩴ()V

    .line 72
    :cond_2
    throw v2
.end method

.method public final ۙ(I[B)V
    .locals 2

    .line 44
    iget-object v0, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ۤ()Ll/᩷ۨᩴ;
    .locals 2

    .line 76
    iget-boolean v0, p0, Ll/ۚۚܳ;->ۤ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۚۚܳ;->ᩴ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷()Ll/᩷ۨᩴ;
    .locals 5

    .line 49
    iget-object v0, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Ll/ۚۚܳ;->᩷:Ljava/io/OutputStream;

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/ۚۚܳ;->ۙ:Z

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x64

    if-ge v1, v2, :cond_1

    .line 53
    iget-object v2, p0, Ll/ۚۚܳ;->᩸:Ll/᩷ۨᩴ;

    .line 1147
    invoke-virtual {v2, v0}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 55
    :try_start_0
    iget-object v3, p0, Ll/ۚۚܳ;->ᩴ:Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->᩶()Ll/ۧۨᩴ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۧۨᩴ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 56
    iput-boolean v0, p0, Ll/ۚۚܳ;->ۤ:Z
    :try_end_0
    .catch Ll/᩸ۨᩴ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    .line 59
    invoke-virtual {v2}, Ll/᩸ۨᩴ;->ۤ()Ll/ۤۨᩴ;

    move-result-object v3

    sget-object v4, Ll/ۤۨᩴ;->᩶:Ll/ۤۨᩴ;

    if-ne v3, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    throw v2

    .line 62
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to publish download file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
