.class public final synthetic Ll/ۛᩴܺ;
.super Ljava/lang/Object;
.source "11V2"

# interfaces
.implements Ll/ۧ۫ۤ;
.implements Ll/ܽۧܺ;
.implements Ll/᩶ۚܺ;
.implements Ll/ܽ֨᩷;
.implements Ll/᩸ۛܽ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛᩴܺ;->ܰ:I

    iput-object p2, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 6

    .line 2
    iget-object v0, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/reflect/Constructor;

    const-string v1, "\' with no args"

    const-string v2, "Failed to invoke constructor \'"

    const/4 v3, 0x0

    .line 262
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 282
    sget v1, Ll/֫ܰܽ;->ۙ:I

    .line 201
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.15.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v3

    .line 276
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    invoke-static {v0}, Ll/֫ܰܽ;->ۙ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 280
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_2
    move-exception v3

    .line 268
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    invoke-static {v0}, Ll/֫ܰܽ;->ۙ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
.end method

.method public ۙ(I)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۛᩴܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۗ֫۫;

    .line 12
    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/ۘᩴܺ;

    int-to-float p1, p1

    const v1, 0x3f19999a    # 0.6f

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 124
    invoke-interface {v0, p1}, Ll/ۘᩴܺ;->ۙ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۫()V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/֨ۗ֫;

    invoke-static {v0}, Ll/֨ۗ֫;->᩷(Ll/֨ۗ֫;)V

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛᩴܺ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 251
    invoke-static {v0}, Ll/۠ۢۚ;->ۙ(Ll/᩷ۨᩴ;)Ll/ۡۢۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢۚ;->ۙ()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
