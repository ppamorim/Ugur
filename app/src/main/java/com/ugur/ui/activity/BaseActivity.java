/*
* Copyright (C) 2015 Pedro Paulo de Amorim.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.ugur.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.github.ppamorim.PrismPosition;
import com.github.ppamorim.SpringType;
import com.github.ppamorim.creator.FragmentViewItemAdapter;
import com.github.ppamorim.creator.FragmentViewItems;
import com.github.ppamorim.prismview.PrismActivity;
import com.github.ppamorim.recyclerrenderers.adapter.RendererAdapter;
import com.github.ppamorim.recyclerrenderers.builder.RendererBuilder;
import com.ugur.R;
import com.ugur.domain.model.Picture;
import com.ugur.ui.fragment.CameraFragment;
import com.ugur.ui.fragment.FilesFragment;
import com.ugur.ui.renderers.factory.PictureFactory;
import com.ugur.utils.MockUtil;
import com.ugur.utils.ViewUtil;

public class BaseActivity extends PrismActivity {

  @Bind(R.id.recycler_view) RecyclerView recyclerView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_base);
    setPrismPosition(PrismPosition.RIGHT);
    setSpringType(SpringType.SPEEDBOUNCINESS);
    setBouncenessSpeed(5, 5);
  }

  @Override protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    ButterKnife.bind(this);
    ViewUtil.configGridRecyclerView(this, recyclerView);
    recyclerView.setAdapter(new RendererAdapter<Picture>(MockUtil.feedMock(), new RendererBuilder(new PictureFactory()),
            LayoutInflater.from(this)));
    FragmentViewItemAdapter fragmentViewItemAdapter =
        new FragmentViewItemAdapter(FragmentViewItems.with(this)
            .add("tag0", FilesFragment.class)
            .add("tag1", CameraFragment.class)
            .create());
    setAdapter(fragmentViewItemAdapter);
  }

  @Override public void onBackPressed() {
    if (isRevelead()) {
      hide();
      return;
    }
    super.onBackPressed();
  }

  public void show() {
    show(0);
  }

}
