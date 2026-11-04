.class public final Ll/ۨܰܽ;
.super Ljava/lang/Object;
.source "Q882"


# static fields
.field public static final ۙ:Ll/᩶ۛܽ;

.field public static final ۤ:Ljava/util/List;

.field public static final ۫:Ll/ܶۨܽ;

.field public static final ܳ:Ll/ܶۨܽ;

.field public static final ᩴ:Ll/᩶ۛܽ;

.field public static final ᩷:Ll/ܶۨܽ;

.field public static final ᩸:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    const-string v2, "java.sql.Date"

    .line 55
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    .line 60
    :goto_0
    sput-boolean v2, Ll/ۨܰܽ;->᩸:Z

    if-eqz v2, :cond_0

    .line 63
    new-instance v2, Ll/ۗܰܽ;

    invoke-direct {v2}, Ll/ۗܰܽ;-><init>()V

    sput-object v2, Ll/ۨܰܽ;->ۙ:Ll/᩶ۛܽ;

    .line 70
    new-instance v2, Ll/᩵ܰܽ;

    invoke-direct {v2}, Ll/᩵ܰܽ;-><init>()V

    sput-object v2, Ll/ۨܰܽ;->ᩴ:Ll/᩶ۛܽ;

    .line 78
    sget-object v2, Ll/᩻ܰܽ;->᩷:Ll/ܶۨܽ;

    sput-object v2, Ll/ۨܰܽ;->᩷:Ll/ܶۨܽ;

    .line 79
    sget-object v3, Ll/ܽܰܽ;->᩷:Ll/ܶۨܽ;

    sput-object v3, Ll/ۨܰܽ;->۫:Ll/ܶۨܽ;

    .line 80
    sget-object v4, Ll/᩹ܰܽ;->᩷:Ll/ܶۨܽ;

    sput-object v4, Ll/ۨܰܽ;->ܳ:Ll/ܶۨܽ;

    const/4 v5, 0x3

    new-array v5, v5, [Ll/ܶۨܽ;

    aput-object v3, v5, v0

    aput-object v2, v5, v1

    const/4 v0, 0x2

    aput-object v4, v5, v0

    .line 84
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 83
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ۨܰܽ;->ۤ:Ljava/util/List;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 86
    sput-object v0, Ll/ۨܰܽ;->ۙ:Ll/᩶ۛܽ;

    .line 87
    sput-object v0, Ll/ۨܰܽ;->ᩴ:Ll/᩶ۛܽ;

    .line 93
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v0, Ll/ۨܰܽ;->ۤ:Ljava/util/List;

    :goto_1
    return-void
.end method
