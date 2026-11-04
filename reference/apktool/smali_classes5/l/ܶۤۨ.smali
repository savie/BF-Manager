.class public final Ll/ܶۤۨ;
.super Ll/᩵ۤۨ;
.source "54FB"


# static fields
.field public static final ֡:Ll/ܶۤۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 2
    new-instance v6, Ll/ܶۤۨ;

    .line 10
    sget v1, Ll/ܰۤۨ;->᩷:I

    sget v2, Ll/ܰۤۨ;->ᩴ:I

    .line 11
    sget-wide v3, Ll/ܰۤۨ;->᩸:J

    sget-object v5, Ll/ܰۤۨ;->ۤ:Ljava/lang/String;

    move-object v0, v6

    .line 9
    invoke-direct/range {v0 .. v5}, Ll/᩵ۤۨ;-><init>(IIJLjava/lang/String;)V

    .line 0
    sput-object v6, Ll/ܶۤۨ;->֡:Ll/ܶۤۨ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 28
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
