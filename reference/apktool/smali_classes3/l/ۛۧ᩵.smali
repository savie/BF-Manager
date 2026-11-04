.class public final synthetic Ll/ۛۧ᩵;
.super Ljava/lang/Object;
.source "DACT"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛۧ᩵;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۗܳ᩵;)V
    .locals 0

    const/4 p1, 0x6

    .line 0
    iput p1, p0, Ll/ۛۧ᩵;->ܰ:I

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
    .locals 4

    .line 2
    iget v0, p0, Ll/ۛۧ᩵;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۖۡۗ;

    const/4 v0, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۨᩳۗ;

    invoke-static {p1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۨᩳۗ;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$2BBeVMEA7lzeM4M97HL_7LcPO4g(Lcom/google/android/material/color/utilities/DynamicScheme;)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$uW4HBIifAUZXF-Euk1B4yNI2ZQs(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ll/۫ۛۚ;

    .line 2000
    iget-object p1, p1, Ll/۫ۛۚ;->ۙ:Ljava/lang/String;

    return-object p1

    .line 0
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 118
    :goto_0
    :try_start_0
    new-instance v1, Ll/֫۫᩵;

    invoke-direct {v1, p1}, Ll/֫۫᩵;-><init>(Ll/ۖۡۗ;)V

    .line 119
    invoke-virtual {v1}, Ll/֫۫᩵;->ۙ()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Multi-variable type inference failed"

    .line 120
    invoke-virtual {p1, v1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 122
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ֨ۗ;

    .line 123
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֫֨ۗ;->᩶()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Multi-variable type inference failed. Error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 0
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
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
