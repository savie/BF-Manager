.class public final Ll/ܶۧ᩺;
.super Ljava/lang/Object;
.source "PAH8"


# static fields
.field public static ۙ:Ljava/lang/Exception;

.field public static ܰ:Ljava/lang/Boolean;


# direct methods
.method public static ۙ()Z
    .locals 7

    .line 40
    sget-object v0, Ll/ܶۧ᩺;->ܰ:Ljava/lang/Boolean;

    if-nez v0, :cond_b

    .line 45
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "zh"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 48
    :goto_0
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "rockchip"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sandbox"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 49
    :goto_1
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "springer"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v0, :cond_3

    if-nez v1, :cond_2

    if-eqz v2, :cond_3

    .line 51
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_5

    .line 52
    :cond_3
    sget-object v0, Ll/ܶۧ᩺;->ۙ:Ljava/lang/Exception;

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SimidaGuarder"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 53
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_5

    .line 75
    :cond_4
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v1, "OnePlus6"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 76
    new-instance v0, Ljava/io/File;

    const-string v1, "/system/app"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 79
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    if-ge v2, v1, :cond_9

    aget-object v4, v0, v2

    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, -0x1

    sparse-switch v5, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v5, "AdbIME"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    const/4 v6, 0x3

    goto :goto_3

    :sswitch_1
    const-string v5, "qq"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    const/4 v6, 0x2

    goto :goto_3

    :sswitch_2
    const-string v5, "weixin"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_3

    :cond_7
    const/4 v6, 0x1

    goto :goto_3

    :sswitch_3
    const-string v5, "alipay"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    const/4 v6, 0x0

    :goto_3
    packed-switch v6, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    add-int/lit8 v3, v3, 0x1

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    const/4 v0, 0x4

    if-ne v3, v0, :cond_a

    .line 55
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_5

    .line 57
    :cond_a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    :goto_5
    sput-object v0, Ll/ܶۧ᩺;->ܰ:Ljava/lang/Boolean;

    .line 68
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x545695b6 -> :sswitch_3
        -0x2f2e7d9e -> :sswitch_2
        0xe20 -> :sswitch_1
        0x7499d6c2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ܰ()V
    .locals 1

    .line 96
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    sput-object v0, Ll/ܶۧ᩺;->ۙ:Ljava/lang/Exception;

    return-void
.end method
