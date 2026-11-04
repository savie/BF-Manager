.class public final synthetic Ll/ܳۚ᩵;
.super Ljava/lang/Object;
.source "V6FE"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳۚ᩵;->ܰ:I

    iput-object p2, p0, Ll/ܳۚ᩵;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ܳۚ᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܳۚ᩵;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۗܳ᩵;

    .line 11
    check-cast p1, Ll/ۖۡۗ;

    .line 14
    invoke-static {v0, p1}, Ll/ۗܳ᩵;->᩸(Ll/ۗܳ᩵;Ll/ۖۡۗ;)Z

    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 22
    :pswitch_0
    iget-object v0, p0, Ll/ܳۚ᩵;->᩶:Ljava/lang/Object;

    .line 24
    check-cast v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    .line 26
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 29
    invoke-static {v0, p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$qYUGZG1G44eNpdpVTV1jfnEU_Uo(Lcom/google/android/material/color/utilities/MaterialDynamicColors;Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object p1

    return-object p1

    .line 33
    :pswitch_1
    iget-object v0, p0, Ll/ܳۚ᩵;->᩶:Ljava/lang/Object;

    .line 35
    check-cast v0, Ljava/lang/String;

    .line 37
    check-cast p1, Ljava/lang/String;

    .line 141
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2f

    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 146
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/ܳۚ᩵;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩹ۚ᩵;

    check-cast p1, Ll/ۖۡۗ;

    invoke-static {v0, p1}, Ll/᩹ۚ᩵;->ۙ(Ll/᩹ۚ᩵;Ll/ۖۡۗ;)Ll/ۖۡۗ;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
