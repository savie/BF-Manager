.class public final Ll/ۧۧ᩵;
.super Ljava/lang/Object;
.source "76EN"


# instance fields
.field public final ۙ:Ll/ܽܿۗ;

.field public final ᩷:Ll/۬ۜۗ;


# direct methods
.method public constructor <init>(Ll/ܽܿۗ;Ll/۬ۜۗ;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Ll/ۧۧ᩵;->ۙ:Ll/ܽܿۗ;

    .line 127
    iput-object p2, p0, Ll/ۧۧ᩵;->᩷:Ll/۬ۜۗ;

    .line 129
    new-instance p1, Ljava/util/ArrayList;

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 159
    throw v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۤ()Ll/۬ۜۗ;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۧۧ᩵;->᩷:Ll/۬ۜۗ;

    return-object v0
.end method

.method public final ᩷()Ljava/util/ArrayList;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
