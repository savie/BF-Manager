.class public final Ll/᩵ܰܽ;
.super Ll/᩶ۛܽ;
.source "Q882"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    const-class v0, Ljava/sql/Timestamp;

    .line 71
    invoke-direct {p0, v0}, Ll/᩶ۛܽ;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/util/Date;)Ljava/util/Date;
    .locals 3

    .line 74
    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    return-object v0
.end method
