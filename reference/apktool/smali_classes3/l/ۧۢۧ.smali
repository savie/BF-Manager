.class public abstract Ll/ۧۢۧ;
.super Ljava/lang/Object;
.source "R5PD"


# direct methods
.method public static ۙ(J)Ljava/lang/String;
    .locals 3

    .line 68
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    .line 69
    invoke-static {v1}, Ll/ۤۚۗ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 75
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract ۙ(Ll/ܳۤܶ;)Ljava/lang/Object;
.end method

.method public abstract ۙ(Ll/ܳۤܶ;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ۙ(Ll/ܳۤܶ;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ۙ(Ll/ܳۤܶ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ۙ(Ll/ܳۤܶ;Ljava/util/ArrayList;)Ljava/lang/Object;
.end method

.method public abstract ۙ(Ljava/lang/String;)Ll/ܽۚ᩹;
.end method

.method public abstract ۙ(Ll/ᩴᩴ᩹;Ll/۫ۚ᩹;)V
.end method

.method public abstract ۤ(Ll/ܳۤܶ;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ᩷(Ll/ܳۤܶ;Ljava/lang/Object;)V
.end method
