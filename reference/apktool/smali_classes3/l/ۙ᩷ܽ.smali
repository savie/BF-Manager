.class public final Ll/ۙ᩷ܽ;
.super Ljava/lang/Object;
.source "H38Z"

# interfaces
.implements Ll/ۜۙܽ;


# instance fields
.field public volatile ܰ:Ll/ۜۙܽ;

.field public ܿ:Ljava/lang/Object;

.field public final ᩶:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۜۙܽ;)V
    .locals 1

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۙ᩷ܽ;->᩶:Ljava/lang/Object;

    .line 186
    iput-object p1, p0, Ll/ۙ᩷ܽ;->ܰ:Ll/ۜۙܽ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 193
    iget-object v0, p0, Ll/ۙ᩷ܽ;->ܰ:Ll/ۜۙܽ;

    if-eqz v0, :cond_1

    .line 194
    iget-object v0, p0, Ll/ۙ᩷ܽ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 195
    :try_start_0
    iget-object v1, p0, Ll/ۙ᩷ܽ;->ܰ:Ll/ۜۙܽ;

    if-eqz v1, :cond_0

    .line 196
    iget-object v1, p0, Ll/ۙ᩷ܽ;->ܰ:Ll/ۜۙܽ;

    invoke-interface {v1}, Ll/ۜۙܽ;->get()Ljava/lang/Object;

    move-result-object v1

    .line 197
    iput-object v1, p0, Ll/ۙ᩷ܽ;->ܿ:Ljava/lang/Object;

    const/4 v2, 0x0

    .line 198
    iput-object v2, p0, Ll/ۙ᩷ܽ;->ܰ:Ll/ۜۙܽ;

    .line 199
    monitor-exit v0

    return-object v1

    .line 201
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 204
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۙ᩷ܽ;->ܿ:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 209
    iget-object v0, p0, Ll/ۙ᩷ܽ;->ܰ:Ll/ۜۙܽ;

    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Suppliers.memoize("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v0, :cond_0

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "<supplier that returned "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۙ᩷ܽ;->ܿ:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
