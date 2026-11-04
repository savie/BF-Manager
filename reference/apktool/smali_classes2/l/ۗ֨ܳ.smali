.class public final Ll/ۗ֨ܳ;
.super Ljava/lang/Object;
.source "052E"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ܰ:Ll/ۨ֨ܳ;


# direct methods
.method public constructor <init>(Ll/ۨ֨ܳ;)V
    .locals 0

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ֨ܳ;->ܰ:Ll/ۨ֨ܳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 233
    iget-object v0, p0, Ll/ۗ֨ܳ;->ܰ:Ll/ۨ֨ܳ;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, p1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v2, v0, Ll/ۨ֨ܳ;->ۜ:Ljava/text/SimpleDateFormat;

    .line 234
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/String;)V

    .line 235
    iget-object p1, v0, Ll/ۨ֨ܳ;->ۜ:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۠ۢᩴ;->᩷(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 237
    iput-object v1, v0, Ll/ۨ֨ܳ;->ۜ:Ljava/text/SimpleDateFormat;

    .line 238
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->᩷(Ljava/lang/String;)V

    .line 239
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
