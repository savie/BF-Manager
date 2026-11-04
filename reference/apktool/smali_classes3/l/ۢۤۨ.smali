.class public final Ll/ۢۤۨ;
.super Ljava/lang/Object;
.source "R96D"


# static fields
.field public static final ۙ:Ll/ۜ᩷ۨ;

.field public static final ۤ:Ll/ۜ᩷ۨ;

.field public static final ᩷:Ll/ۜ᩷ۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 870
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "STATE_REG"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۢۤۨ;->ۤ:Ll/ۜ᩷ۨ;

    .line 871
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "STATE_COMPLETED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۢۤۨ;->᩷:Ll/ۜ᩷ۨ;

    .line 872
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "STATE_CANCELLED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۢۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public static final synthetic ۙ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/ۢۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ۤ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/ۢۤۨ;->ۤ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ᩷()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/ۢۤۨ;->᩷:Ll/ۜ᩷ۨ;

    return-object v0
.end method
