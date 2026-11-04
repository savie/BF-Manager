.class public final Ll/֫᩷ۨ;
.super Ljava/lang/Object;
.source "4AX2"


# static fields
.field public static final ۙ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 20
    :try_start_0
    new-instance v0, Ll/᩶۬᩵;

    invoke-direct {v0}, Ll/᩶۬᩵;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [Ll/֨۠᩵;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "<this>"

    .line 0
    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v1, Ll/ۗۖ᩵;

    invoke-direct {v1, v0}, Ll/ۗۖ᩵;-><init>(Ljava/util/Iterator;)V

    .line 677
    new-instance v0, Ll/᩸ۖ᩵;

    invoke-direct {v0, v1}, Ll/᩸ۖ᩵;-><init>(Ll/ۗۖ᩵;)V

    .line 20
    invoke-static {v0}, Ll/ܺۖ᩵;->ۙ(Ll/֫ۖ᩵;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/֫᩷ۨ;->ۙ:Ljava/util/List;

    return-void

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static final ۙ()Ljava/util/List;
    .locals 1

    .line 17
    sget-object v0, Ll/֫᩷ۨ;->ۙ:Ljava/util/List;

    return-object v0
.end method
