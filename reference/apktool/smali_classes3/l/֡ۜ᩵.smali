.class public final Ll/֡ۜ᩵;
.super Ljava/lang/Object;
.source "36ID"

# interfaces
.implements Ll/۟ۜ᩵;


# instance fields
.field public final ܰ:Ll/ۗ֨᩵;


# direct methods
.method public constructor <init>(Ll/ۗ֨᩵;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۜ᩵;->ܰ:Ll/ۗ֨᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InternalCompletionHandler.UserSupplied["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡ۜ᩵;->ܰ:Ll/ۗ֨᩵;

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/᩷ۜ᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ljava/lang/Throwable;)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֡ۜ᩵;->ܰ:Ll/ۗ֨᩵;

    check-cast v0, Ll/ۙ۬᩵;

    invoke-virtual {v0, p1}, Ll/ۙ۬᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
