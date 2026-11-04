.class public final Ll/۬ۗۨ;
.super Ljava/lang/Object;
.source "M4LF"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ܿ:Ll/ۜۗۨ;

.field public static final ᩶:Ll/۬ۗۨ;


# instance fields
.field public final ܰ:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 217
    new-instance v0, Ll/۠ۗۨ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/ۜۗۨ;

    invoke-direct {v1, v0}, Ll/ۜۗۨ;-><init>(Ll/۠ۗۨ;)V

    sput-object v1, Ll/۬ۗۨ;->ܿ:Ll/ۜۗۨ;

    .line 219
    new-instance v0, Ll/۬ۗۨ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۬ۗۨ;-><init>([C)V

    sput-object v0, Ll/۬ۗۨ;->᩶:Ll/۬ۗۨ;

    return-void
.end method

.method public constructor <init>([C)V
    .locals 0

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 242
    iput-object p1, p0, Ll/۬ۗۨ;->ܰ:[C

    return-void
.end method

.method public static ᩷()Ll/۬ۗۨ;
    .locals 3

    .line 227
    sget-object v0, Ll/۬ۗۨ;->ܿ:Ll/ۜۗۨ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 229
    aget-object v2, v0, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 230
    new-instance v0, Ll/۬ۗۨ;

    sget-object v1, Ll/ۙ᩵ۨ;->ۙ:[B

    const/16 v1, 0x2000

    new-array v1, v1, [C

    invoke-direct {v0, v1}, Ll/۬ۗۨ;-><init>([C)V

    return-object v0

    .line 232
    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    .line 233
    sget-object v0, Ll/۬ۗۨ;->᩶:Ll/۬ۗۨ;

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 254
    iget-object v0, p0, Ll/۬ۗۨ;->ܰ:[C

    if-nez v0, :cond_0

    .line 255
    sget-object v0, Ll/۬ۗۨ;->ܿ:Ll/ۜۗۨ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    .line 256
    aget-object v1, v0, v1

    check-cast v1, [C

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([CC)V

    .line 257
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, v0, v2

    :cond_0
    return-void
.end method

.method public final ۙ()[C
    .locals 2

    .line 246
    iget-object v0, p0, Ll/۬ۗۨ;->ܰ:[C

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ll/۬ۗۨ;->ܿ:Ll/ۜۗۨ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, [C

    return-object v0
.end method
