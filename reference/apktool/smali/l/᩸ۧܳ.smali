.class public final Ll/᩸ۧܳ;
.super Ljava/lang/Object;
.source "N6JA"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ܰ:Z

.field public final synthetic ܿ:Ll/ᩴۧܳ;

.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ᩴۧܳ;Ljava/lang/String;)V
    .locals 0

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۧܳ;->ܿ:Ll/ᩴۧܳ;

    iput-object p2, p0, Ll/᩸ۧܳ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 222
    iget-boolean v0, p0, Ll/᩸ۧܳ;->ܰ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 223
    iput-boolean v0, p0, Ll/᩸ۧܳ;->ܰ:Z

    .line 224
    iget-object v1, p0, Ll/᩸ۧܳ;->ܿ:Ll/ᩴۧܳ;

    invoke-static {v1}, Ll/ᩴۧܳ;->ۙ(Ll/ᩴۧܳ;)Ljava/util/HashMap;

    move-result-object v2

    iget-object v3, p0, Ll/᩸ۧܳ;->᩶:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v0, :cond_1

    .line 225
    invoke-static {v1}, Ll/ᩴۧܳ;->ۙ(Ll/ᩴۧܳ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 226
    :cond_1
    invoke-static {v1}, Ll/ᩴۧܳ;->ۙ(Ll/ᩴۧܳ;)Ljava/util/HashMap;

    move-result-object v4

    sub-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    :goto_0
    invoke-static {v1}, Ll/ᩴۧܳ;->᩸(Ll/ᩴۧܳ;)V

    .line 228
    invoke-static {v1}, Ll/ᩴۧܳ;->ۤ(Ll/ᩴۧܳ;)V

    .line 229
    invoke-static {v1}, Ll/ᩴۧܳ;->᩷(Ll/ᩴۧܳ;)V

    return-void
.end method
