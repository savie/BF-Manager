.class public final Ll/ۖۗۨ;
.super Ljava/lang/Object;
.source "M4LF"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ܿ:Ll/ۡۗۨ;

.field public static final ᩶:Ll/ۖۗۨ;


# instance fields
.field public final ܰ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 149
    new-instance v0, Ll/֨ۗۨ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/ۡۗۨ;

    invoke-direct {v1, v0}, Ll/ۡۗۨ;-><init>(Ll/֨ۗۨ;)V

    sput-object v1, Ll/ۖۗۨ;->ܿ:Ll/ۡۗۨ;

    .line 151
    new-instance v0, Ll/ۖۗۨ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۖۗۨ;-><init>([B)V

    sput-object v0, Ll/ۖۗۨ;->᩶:Ll/ۖۗۨ;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Ll/ۖۗۨ;->ܰ:[B

    return-void
.end method

.method public static ᩷()Ll/ۖۗۨ;
    .locals 3

    .line 159
    sget-object v0, Ll/ۖۗۨ;->ܿ:Ll/ۡۗۨ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 161
    aget-object v2, v0, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 162
    new-instance v0, Ll/ۖۗۨ;

    sget-object v1, Ll/ۙ᩵ۨ;->ۙ:[B

    const/16 v1, 0x2000

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Ll/ۖۗۨ;-><init>([B)V

    return-object v0

    .line 164
    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v2, v0, v1

    .line 165
    sget-object v0, Ll/ۖۗۨ;->᩶:Ll/ۖۗۨ;

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 186
    iget-object v0, p0, Ll/ۖۗۨ;->ܰ:[B

    if-nez v0, :cond_0

    .line 187
    sget-object v0, Ll/ۖۗۨ;->ܿ:Ll/ۡۗۨ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    .line 188
    aget-object v1, v0, v1

    check-cast v1, [B

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 189
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v1, v0, v2

    :cond_0
    return-void
.end method

.method public final ۙ()[B
    .locals 2

    .line 178
    iget-object v0, p0, Ll/ۖۗۨ;->ܰ:[B

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ll/ۖۗۨ;->ܿ:Ll/ۡۗۨ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, [B

    return-object v0
.end method
