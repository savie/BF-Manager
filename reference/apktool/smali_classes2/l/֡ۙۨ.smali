.class public final Ll/֡ۙۨ;
.super Ljava/lang/Object;
.source "1ANI"


# static fields
.field public static final ۙ:Ll/ۜ᩷ۨ;

.field public static final ᩷:Ll/ۜ᩷ۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 237
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/֡ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    .line 239
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/֡ۙۨ;->᩷:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public static final ۙ(Ll/ۖۧۙ;)Ll/ۘۙۨ;
    .locals 1

    .line 183
    new-instance v0, Ll/ܿۙۨ;

    if-nez p0, :cond_0

    sget-object p0, Ll/۠ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    :cond_0
    invoke-direct {v0, p0}, Ll/ܿۙۨ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic ۙ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/֡ۙۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ᩷()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/֡ۙۨ;->᩷:Ll/ۜ᩷ۨ;

    return-object v0
.end method
